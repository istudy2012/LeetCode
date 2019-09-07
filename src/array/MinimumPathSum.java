package array;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) {
                        result[0][0] = grid[0][0];
                    } else {
                        result[0][j] = result[0][j - 1] + grid[0][j];
                    }
                } else if (j == 0) {
                    result[i][0] = result[i - 1][0] + grid[i][0];
                } else {
                    result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
                }
            }
        }

        return result[m - 1][n - 1];
    }
}
