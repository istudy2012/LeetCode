package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations/
 */
public class Combinations {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        traverse(n, k, 1, new ArrayList<>(), result);

        return result;
    }

    private void traverse(int n, int k, int position,
                          List<Integer> items, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(items));
            return;
        }

        for (int i = position; i <= n - k + 1; i++) {
            items.add(i);
            traverse(n, k - 1, i + 1, items, result);
            items.remove(items.size() - 1);
        }
    }

}
