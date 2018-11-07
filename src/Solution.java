import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        result = new ArrayList<>();
        traverse(candidates, 0 ,target, new ArrayList<Integer>());
        return result;
    }

    private void traverse(int[] candidates, int start, int target, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        if (start == candidates.length) {
            return;
        }


        list.add(candidates[start]);
        traverse(candidates, start, target - candidates[start], list);

        list.remove(list.size() - 1);
        traverse(candidates, start + 1, target, list);
    }
}