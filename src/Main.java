import java.util.Arrays;

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

        System.out.println( solution.numTrees2(3));
        System.out.println( solution.numTrees2(1));
        System.out.println( solution.numTrees2(4));
        System.out.println( solution.numTrees2(5));
    }


}
