package array;

public class RemoveDuplicatesFromSortedArrayII80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int p = 0;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums[i];
                count = 1;
            } else {
                if (count < 2) {
                    p++;
                    nums[p] = nums[i];
                    count++;
                }
            }
        }

        return p + 1;
    }

}
