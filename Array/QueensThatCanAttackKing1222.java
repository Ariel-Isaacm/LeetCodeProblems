package Array;

import java.util.ArrayList;
import java.util.List;

public class QueensThatCanAttackKing1222 {
    class Solution {

        public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
            char[][] board = new char[8][8];
            for(int i=0;i<queens.length; i++){
                board[queens[i][0]][queens[i][1]] = 'Q';
            }
            board[king[0]][king[1]] = 'K';
            //go up
            List<List<Integer>> ans = new ArrayList();

            for(int i=king[1]; i>=0; i--){
                if(board[king[0]][i] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(king[0]);
                    queen.add(i);
                    ans.add(queen);
                    break;
                }
            }
            //go diagonal right up
            int x = king[0];
            int y = king[1];
            while(x <8 && y >= 0){
                if(board[x][y] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(x);
                    queen.add(y);
                    ans.add(queen);
                    break;
                }
                y--;
                x++;
            }
            //go right
            for(int i=king[0]; i<8;i++){
                if(board[i][king[1]] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(i);
                    queen.add(king[1]);
                    ans.add(queen);
                    break;
                }
            }

            //go diagional right down
            x = king[0];
            y = king[1];
            while(x < 8 && y < 8){
                if(board[x][y] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(x);
                    queen.add(y);
                    ans.add(queen);
                    break;
                }
                y++;
                x++;
            }
            //go down
            for(int i=king[1]; i<8;i++){
                if(board[king[0]][i] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(king[0]);
                    queen.add(i);
                    ans.add(queen);
                    break;
                }
            }
            x = king[0];
            y = king[1];
            //go diagonal left down
            while(x >= 0 && y < 8){
                if(board[x][y] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(x);
                    queen.add(y);
                    ans.add(queen);
                    break;
                }
                y++;
                x--;
            }
            //go left
            for(int i=king[0]; i>=0;i--){
                if(board[i][king[1]] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(i);
                    queen.add(king[1]);
                    ans.add(queen);
                    break;
                }
            }
            x = king[0];
            y = king[1];
            //go diagonal left up
            while(x >= 0 && y >= 0){
                if(board[x][y] == 'Q'){
                    List<Integer> queen = new ArrayList();
                    queen.add(x);
                    queen.add(y);
                    ans.add(queen);
                    break;
                }
                y--;
                x--;
            }
            return ans;
        }
    }
}
