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

//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        System.out.println(solution.spiralOrder(arr));
//
//        int[][] arr1 = new int[][]{{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}};
//        System.out.println(solution.spiralOrder(arr1));
//
//        int[][] arr2 = new int[][]{{6, 9, 7}};
//        System.out.println(solution.spiralOrder(arr2));

        int[][] arr3 = new int[][]{{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
        System.out.println(solution.spiralOrder(arr3));
    }

}
