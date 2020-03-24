package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0, j = 0; 2 * i < m && 2 * j < n; i++, j++) {
            printRect(matrix, i, j, m - 2 * i, n - 2 * j, result);
        }

        return result;
    }

    private void printRect(int[][] matrix, int x, int y, int m, int n, List<Integer> result) {
        if (m < 0 || n < 0) {
            return;
        }

        if (m == 1) {
            printRaw(matrix, x, y, n, 1, result);
            return;
        }
        if (n == 1) {
            printCol(matrix, x, y, m, 1, result);
            return;
        }

        printRaw(matrix, x, y, n - 1, 1, result);
        printCol(matrix, x, y + n - 1, m - 1, 1, result);
        printRaw(matrix, x + m - 1, y + n - 1, n - 1, -1, result);
        printCol(matrix, x + m - 1, y, m - 1, -1, result);
    }

    private void printRaw(int[][] matrix, int x, int y, int n, int direct, List<Integer> result) {
        if (n < 0) {
            return;
        }
        if (direct == 1) {
            for (int i = y; i < y + n; i++) {
                result.add(matrix[x][i]);
            }
        } else {
            for (int i = y; i > y - n; i--) {
                result.add(matrix[x][i]);
            }
        }
    }

    private void printCol(int[][] matrix, int x, int y, int m, int direct, List<Integer> result) {
        if (m < 0) {
            return;
        }
        if (direct == 1) {
            for (int i = x; i < x + m; i++) {
                result.add(matrix[i][y]);
            }
        } else {
            for (int i = x; i > x - m; i--) {
                result.add(matrix[i][y]);
            }
        }
    }
}
