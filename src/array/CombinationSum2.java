package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    /**
     * https://leetcode.com/problems/combination-sum-ii/
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        traverse(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void traverse(int[] candidates, int target, int start,
                          List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || start == candidates.length || candidates[start] > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            list.add(candidates[i]);
            traverse(candidates, target - candidates[i], i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
