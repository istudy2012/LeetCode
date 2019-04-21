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
        Solution solution = new Solution();

        int[] array = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(solution.searchRange(array, 8)) );

        System.out.println(Arrays.toString(solution.searchRange(array, 6)) );
    }

}
