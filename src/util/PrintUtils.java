package util;

import model.TreeNode;

import java.util.Arrays;
import java.util.Collection;

public class PrintUtils {
    private PrintUtils() {
    }

    public static String getString(int[] nums) {
        return Arrays.toString(nums);
    }

    public static String getString(Collection nums) {
        return nums.toString();
    }

    public static void println(Object o) {
        if (o.getClass().isArray()) {
            System.out.println(Arrays.deepToString((Object[]) o));
        } else if (o instanceof TreeNode) {
            TreeUtil.printNode((TreeNode) o);
        } else {
            System.out.println(o);
        }
    }
}
