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

        char[][] board = new char[][] {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solution.isValidSudoku(board));
    }

}
