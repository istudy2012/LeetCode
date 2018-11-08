package implement;

import java.util.Arrays;

public class NumArray {
    private int[] numArray;
    private int length;
    private int[] dp;

    public NumArray(int[] nums) {
        numArray = nums;
        length = nums.length;
        dp = new int[length];

        if (length != 0) {
            dp[0] = nums[0];
            for (int i = 1; i < length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (length == 0) {
            return 0;
        }

        return dp[j] - dp[i] + numArray[i];
    }
}

/**
 * Your implement.NumArray object will be instantiated and called as such:
 * implement.NumArray obj = new implement.NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */