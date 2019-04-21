package array;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElement34 {

    public static void test() {
        FindFirstAndLastPositionOfElement34 solution = new FindFirstAndLastPositionOfElement34();

        int[] array = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(solution.searchRange(array, 8)) );

        System.out.println(Arrays.toString(solution.searchRange(array, 6)) );
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                int start = mid;
                int end = mid;
                for (int i = mid - 1; i >= 0; i--) {
                    if (nums[i] == target) {
                        start = i;
                    }
                }
                for (int i = mid + 1; i < nums.length; i++) {
                    if (nums[i] == target) {
                        end = i;
                    }
                }
                return new int[]{start, end};
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

}
