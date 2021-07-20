package tree;

import java.util.HashMap;
import java.util.Map;

public class DifferenceNumberTree {

    private Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += numTrees(i) * numTrees(n - i - 1);
        }

        map.put(n, count);

        return count;
    }

    public int numTrees2(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }

        return arr[n];
    }

}
