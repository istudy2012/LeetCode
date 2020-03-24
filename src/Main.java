import array.MyCalendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        long start = System.currentTimeMillis();
        doWork();
        long end = System.currentTimeMillis();
        System.out.println("Spend time: " + (end - start) + "ms");
    }

    private static void doWork() {
        test();
    }

    private static void test() {
        Solution solution = new Solution();

        String line = "[1,2,3,4,5]";
        ListNode head = Util.stringToListNode(line);
        int k = 2;

        ListNode ret = solution.rotateRight(head, k);

        String out = Util.listNodeToString(ret);

        System.out.print(out);
    }


}
