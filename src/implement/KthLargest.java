package implement;

class KthLargest {
    private int[] array;
    private int k;

    public KthLargest(int k, int[] nums) {
        array = new int[k + 1];
        this.k = k;

        for (int i = 1; i <= k; i++) {
            if (i > nums.length) {
                array[i] = Integer.MIN_VALUE;
            } else {
                array[i] = nums[i - 1];
            }
        }

        init();
        for (int i = k; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    private void adjust(int index) {
        if (index >= array.length) {
            return;
        }

        int left;
        if (2 * index >= array.length) {
            left = Integer.MAX_VALUE;
        } else {
            left = array[2 * index];
        }

        int right;
        if (2 * index + 1 >= array.length) {
            right = Integer.MAX_VALUE;
        } else {
            right = array[2 * index + 1];
        }

        int min = Math.min(left, right);
        if (min < array[index]) {
            if (min == left) {
                int t = array[index];
                array[index] = min;
                array[2 * index] = t;
                adjust(2 * index);
            } else {
                int t = array[index];
                array[index] = min;
                array[2 * index + 1] = t;
                adjust(2 * index + 1);
            }
        }
    }

    public int add(int val) {
        if (val > array[1]) {
            array[1] = val;
            adjust(1);
        }

        return array[1];
    }

    private void init() {
        for (int i = k / 2 + 1; i >= 1; i--) {
            adjust(i);
        }
    }
}