import array.MyCalendar;

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

        int[][] array = new int[][] {
            {1,3},{2,6},{8,10},{15,18}
        };
        int[][] result = solution.merge(array);
        System.out.println(Arrays.deepToString(result));
    }

}
