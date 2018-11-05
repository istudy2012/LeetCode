import java.util.List;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int[] toArray(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return new int[]{};
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
