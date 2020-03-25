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

        int[] arr = new int[]{ 0,0,1,1,1,1,2,3,3};

        System.out.println(solution.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }


}
