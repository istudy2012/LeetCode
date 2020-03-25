package array;

public class CountAndSay38 {

    public String countAndSay(int n) {
        if (n <= 0) {
            return "-1";
        }

        String result = "1";
        for (int i = 1; i < n; i++) {
            result = getNext(result);
        }

        return result;
    }

    private String getNext(String value) {
        StringBuilder sb = new StringBuilder();
        char c = value.charAt(0);
        int count = 1;
        int i = 0;
        while (i < value.length()) {
            if (i + 1 < value.length() && value.charAt(i + 1) == c) {
                count++;
            } else {
                sb.append(count).append(c);
                count = 0;

                if (i + 1 < value.length()) {
                    count = 1;
                    c = value.charAt(i + 1);
                }
            }
            i++;
        }

        return sb.toString();
    }

}
