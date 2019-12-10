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

        int[] arr = new int[] {2,0,2,1,1,0};
        solution.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

}
