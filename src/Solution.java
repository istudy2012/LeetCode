import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> results = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return results;
        }

        int wordLength = words.length * words[0].length();
        int[] used = new int[words.length];
        for (int i = 0; i <= s.length() - wordLength; i++) {
            if (isValid(s, i, words, used)) {
                results.add(i);
            }
        }

        return results;
    }

    private boolean isValid(String s, int index, String[] words, int[] used) {
        if (isAllUsed(used)) {
            return true;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i] == 0) {
                if (s.startsWith(words[i], index)) {
                    used[i] = 1;
                    boolean result = isValid(s, index + words[i].length(), words, used);
                    used[i] = 0;
                    return result;
                }
            }
        }

        return false;
    }

    private boolean isAllUsed(int[] used) {
        for (int i : used) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }

}
