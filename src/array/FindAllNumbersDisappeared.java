package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    /**
     * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            while (nums[j - 1] != j) {
                int t = nums[j - 1];
                nums[j - 1] = j;
                j = t;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
