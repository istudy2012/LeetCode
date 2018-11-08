package array;

public class RotateImage {
    /**
     * https://leetcode.com/problems/rotate-image
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n/2); i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int p = matrix[i][j];
                int q = matrix[j][n - 1 - i];
                for (int m = 0; m < 4; m++) {
                    matrix[j][n - 1 - i] = p;
                    int t = n - 1 - i;
                    i = j;
                    j = t;
                    p = q;
                    q = matrix[j][n - 1 - i];
                }
            }
        }
    }
}
