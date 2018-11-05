package string;

public class CustomSortString {
    public static void test() {
        CustomSortString customSortString = new CustomSortString();

        String S = "cba";
        String T = "cbadca";
        System.out.println(customSortString.customSortString(S, T));
    }

    public String customSortString(String S, String T) {
        int[] count = new int[26];
        for (char c : T.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            while (count[c - 'a'] > 0) {
                sb.append(c);
                count[c - 'a']--;
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sb.toString();
    }
}
