public class Algorithm {

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int i = partition(nums, begin, end);

        quickSort(nums, begin, i - 1);
        quickSort(nums, i + 1, end);
    }

    public static int partition(int[] nums, int begin, int end) {
        int p = nums[end];

        int i = begin;
        int j = end - 1;
        while (i < j) {
            if (nums[i] <= p) {
                i++;
                continue;
            }

            if (nums[j] >= p) {
                j--;
                continue;
            }

            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }

        if (nums[i] > p) {
            int t = nums[i];
            nums[i] = p;
            nums[end] = t;
            return i;
        } else if (nums[i] < p) {
            int t = nums[i + 1];
            nums[i + 1] = p;
            nums[end] = t;
            return i + 1;
        } else {
            return i;
        }
    }
}
