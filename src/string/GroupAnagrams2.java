package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String hash = hash(str);
            if (map.containsKey(hash)) {
                map.get(hash).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(hash, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    private String hash(String str) {
        int[] arr = new int[26];
        for (char i : str.toCharArray()) {
            arr[i - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                sb.append('a' + i).append(arr[i]);
            }
        }

        return sb.toString();
    }

}
