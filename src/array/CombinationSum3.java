package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {

    /**
     * https://leetcode.com/problems/combination-sum-iii/
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void traverse(int k, int n, int i, List<Integer> list,
                          List<List<Integer>> result) {
        if (n == 0) {
            if (k == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if (k <= 0 || n < 0 || i > 9 || i > n) {
            return;
        }

        list.add(i);
        traverse(k - 1, n - i, i + 1, list, result);

        list.remove(list.size() - 1);
        traverse(k, n, i + 1, list, result);
    }

    public List<List<Integer>> combinationSum3New(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        traverseNew(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void traverseNew(int k, int n, int i, List<Integer> list,
                             List<List<Integer>> result) {
        if (n == 0) {
            if (k == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if (k <= 0 || n < 0 || i > 9 || i > n) {
            return;
        }

        for (int p = i; p < 10; p++) {
            list.add(p);
            traverse(k - 1, n - p, p + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
