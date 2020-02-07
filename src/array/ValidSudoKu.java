package array;

public class ValidSudoKu {

    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }
        int m = board.length;
        int n = board[0].length;
        if (m != 9 || n != 9) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            boolean[] data = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int v = board[i][j] - '0';
                    if (!data[v]) {
                        data[v] = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            boolean[] data = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int v = board[j][i] - '0';
                    if (!data[v]) {
                        data[v] = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] data = new boolean[10];
                for (int a1 = i * 3; a1 < i * 3 + 3; a1++) {
                    for (int a2 = j * 3; a2 < j * 3 + 3; a2++) {
                        if (board[a1][a2] != '.') {
                            int v = board[a1][a2] - '0';
                            if (!data[v]) {
                                data[v] = true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

}
