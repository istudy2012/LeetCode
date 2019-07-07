import array.MyCalendar;

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

        int[][] A = new int[][] {{1,1,0},{0,1,0},{0,1,0}};
        int[][] B = new int[][] {{0,0,0},{0,1,1},{0,0,1}};

        System.out.println(solution.largestOverlap(A, B));
    }

}
