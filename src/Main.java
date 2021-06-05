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

        int[] nums0 = new int[] {0};
        System.out.println(solution.jump(nums0));

        int[] nums1 = new int[] {2,3,1,1,4};
        System.out.println(solution.jump(nums1));

        int[] nums2 = new int[] {2,3,0,1,4};
        System.out.println(solution.jump(nums2));
    }


}
