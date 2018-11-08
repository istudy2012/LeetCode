package util;

public class AssertUtils {
    private AssertUtils() {
    }

    public void assertInt(int realV, int targetV, String message) {
        if (realV != targetV) {
            throw new AssertionError(message);
        }
    }
}
