package array;

public class SearchInRotatedSortedArray33 {

    public static void test() {
        SearchInRotatedSortedArray33 solution = new SearchInRotatedSortedArray33();

        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(array, 0));
        System.out.println(solution.search(array, 3));

        array = new int[]{3, 1};
        System.out.println(solution.search(array, 1));
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;
        if (nums[low] < nums[high]) {
            return searchInOrder(nums, low, high, target);
        } else {
            return searchInRotate(nums, low, high, target);
        }
    }

    private int searchInRotate(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        } else if (low == high) {
            return target == nums[low] ? low : -1;
        }

        int mid = (low + high) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (nums[low] == nums[mid]) {
            return nums[high] == target ? high : -1;
        } else if (nums[low] < nums[mid]) {
            if (target < nums[mid]) {
                if (target == nums[low]) {
                    return low;
                } else if (target < nums[low]) {
                    return searchInRotate(nums, mid + 1, high, target);
                } else {
                    return searchInOrder(nums, low, mid - 1, target);
                }
            } else {
                return searchInRotate(nums, mid + 1, high, target);
            }
        } else {
            if (target < nums[mid]) {
                return searchInRotate(nums, low, mid - 1, target);
            } else {
                if (target == nums[high]) {
                    return high;
                } else if (target < nums[high]) {
                    return searchInOrder(nums, mid + 1, high, target);
                } else {
                    return searchInRotate(nums, low, mid - 1, target);
                }
            }
        }
    }

    private int searchInOrder(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
