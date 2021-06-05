class Solution {

    /**
     * Key point: The position furthest from the tail is the best position
     */
    public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int n = nums.length - 1;
        int count = 1;
        int k = find(nums, n);
        while (k > 0) {
            count++;
            k = find(nums, k);
        }

        return count;
    }

    private int find(int[] nums, int n) {
        int k = -1;
        for (int i = 0; i < n; i++) {
            if ((i + nums[i]) >= n) {
                k = i;
                break;
            }
        }

        return k;
    }
}