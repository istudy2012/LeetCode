package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    /**
     * https://leetcode.com/problems/combination-sum/
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        traverse(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void traverse(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || start == candidates.length || candidates[start] > target) {
            return;
        }

        list.add(candidates[start]);
        traverse(candidates, start, target - candidates[start], list, result);

        list.remove(list.size() - 1);
        traverse(candidates, start + 1, target, list, result);
    }
}
