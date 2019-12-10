package array;

public class SortColors {
    public void sortColors(int[] nums) {
        int i0 = 0;
        int i2 = nums.length - 1;
        int cur = 0;

        while (cur <= i2) {
            switch (nums[cur]) {
                case 0:
                    swap(nums, i0, cur);
                    i0++;
                    cur++;
                    break;
                case 1:
                    cur++;
                    break;
                case 2:
                    swap(nums, cur, i2);
                    i2--;
                    break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
