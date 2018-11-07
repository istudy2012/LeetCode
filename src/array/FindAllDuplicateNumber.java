package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumber {

    /**
     * https://leetcode.com/problems/find-all-duplicates-in-an-array/
     */
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int k = Math.abs(arr[i]) - 1;
            if (arr[k] < 0) {
                list.add(k + 1);
            } else {
                arr[k] = -arr[k];
            }
        }

        return list;
    }
}
