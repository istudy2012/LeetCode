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

        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(array, 0));
        System.out.println(solution.search(array, 3));

        array = new int[]{3, 1};
        System.out.println(solution.search(array, 1));
    }

}
