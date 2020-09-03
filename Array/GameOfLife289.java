package Array;

public class GameOfLife289 {
    class Solution {
        public void gameOfLife(int[][] board) {
            if (board == null || board.length < 1) return;
            int[][] newBoard = new int[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    int livingNeigh = getLiving(board, i, j);
                    boolean alive = board[i][j] == 1;
                    if (livingNeigh < 2 && alive) {
                        newBoard[i][j] = 0;
                    } else if (livingNeigh <= 3 && alive) {
                        newBoard[i][j] = 1;
                    } else if (livingNeigh > 3 && alive) {
                        newBoard[i][j] = 0;
                    } else if (livingNeigh == 3 && !alive) {
                        newBoard[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = newBoard[i][j];
                }
            }

        }

        private int getLiving(int[][] board, int i, int j) {
            int ans = 0;
            //cardinal directions
            if (i + 1 < board.length && board[i + 1][j] == 1) {
                ans++;
            }
            if (i - 1 >= 0 && board[i - 1][j] == 1) {
                ans++;
            }
            if (j + 1 < board[i].length && board[i][j + 1] == 1) {
                ans++;
            }
            if (j - 1 >= 0 && board[i][j - 1] == 1) {
                ans++;
            }

            //diagonal directions

            if (j - 1 >= 0 && i - 1 >= 0 && board[i - 1][j - 1] == 1) {
                ans++;
            }
            if (j - 1 >= 0 && i + 1 < board.length && board[i + 1][j - 1] == 1) {
                ans++;
            }
            if (i + 1 < board.length && j + 1 < board[i + 1].length && board[i + 1][j + 1] == 1) {
                ans++;
            }
            if (i - 1 >= 0 && j + 1 < board[i - 1].length && board[i - 1][j + 1] == 1) {
                ans++;
            }
            return ans;
        }
    }
}
