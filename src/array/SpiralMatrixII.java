package array;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[] orientation = new int[]{0, 1, 2, 3};
        int currentValue = 1;
        int x = 0;
        int y = 0;

        int[][] matrix = new int[n][n];
        int length = n - 1;
        for (; length >= 1; length = length - 2) {
            for (int direct : orientation) {
                for (int i = 0; i < length; i++) {
                    matrix[x][y] = currentValue;
                    currentValue++;
                    switch (direct) {
                        case 0:
                            y++;
                            break;
                        case 1:
                            x++;
                            break;
                        case 2:
                            y--;
                            break;
                        case 3:
                            x--;
                            break;
                    }
                }
            }
            x++;
            y++;
        }

        if (length == 0) {
            matrix[x][y] = currentValue;
        }

        return matrix;
    }
}
