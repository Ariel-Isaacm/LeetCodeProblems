package Array;

public class IsValidSudoku36 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            for (int i = 0; i < 9; i++) {
                boolean[] nums = new boolean[10];
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] - 48 >= 0 && board[i][j] - 48 <= 9) {
                        if (nums[board[i][j] - 48]) {
                            return false;
                        }
                        nums[board[i][j] - 48] = true;
                    }

                }
            }

            for (int i = 0; i < 9; i++) {
                boolean[] nums = new boolean[10];
                for (int j = 0; j < 9; j++) {
                    if (board[j][i] - 48 >= 0 && board[j][i] - 48 <= 9) {
                        if (nums[board[j][i] - 48]) {
                            return false;
                        }
                        nums[board[j][i] - 48] = true;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    boolean[] nums = new boolean[10];
                    for (int k = j * 3; k < (j * 3 + 3); k++) {
                        for (int l = i * 3; l < (i * 3 + 3); l++) {
                            if (board[k][l] - 48 >= 0 && board[k][l] - 48 <= 9) {
                                if (nums[board[k][l] - 48]) {
                                    return false;
                                }
                                nums[board[k][l] - 48] = true;
                            }
                        }
                    }

                }
            }
            return true;
        }
    }
}
