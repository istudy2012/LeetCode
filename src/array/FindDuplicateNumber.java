package array;

public class FindDuplicateNumber {

    /**
     * This is not valid
     * Space is O(n) and not satisfy
     */
    public int findDuplicate(int[] nums) {
        boolean[] filled =new boolean[nums.length];
        for (int n : nums) {
            if (filled[n]) {
                return n;
            } else {
                filled[n] = true;
            }
        }

        return -1;
    }
}
