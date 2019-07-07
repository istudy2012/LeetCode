package array;

public class ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;

        int maxCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < 4; d++) {
                    int count = countOne(A, B, i, j, d);
                    if (count > maxCount) {
                        maxCount = count;
                    }
                }
            }
        }

        return maxCount;
    }

    private int countOne(int[][] A, int[][] B, int dX, int dY, int direct) {
        int m = A.length;
        int n = A[0].length;

        int left;
        int top;
        int right;
        int bottom;

        int baseX;
        int baseY;
        switch (direct) {
            case 0:
                left = dY;
                top = dX;
                right = n;
                bottom = m;
                baseX = -dX;
                baseY = -dY;
                break;
            case 1:
                left = dY;
                right = n;
                top = 0;
                bottom = n - dX;
                baseX = dX;
                baseY = -dY;
                break;
            case 2:
                left = 0;
                right = n - dY;
                top = 0;
                bottom = m - dX;
                baseX = dX;
                baseY = dY;
                break;
            case 3:
                left = 0;
                right = n - dY;
                top = dX;
                bottom = m;
                baseX = -dX;
                baseY = dY;
                break;
            default:
                return 0;

        }

        int count = 0;
        for (int i = top; i < bottom; i++) {
            for (int j = left; j < right; j++) {
                if (A[i][j] == 1 && B[i + baseX][j + baseY] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
