package Array;

public class NumberOfIslands200 {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid.length==0) return 0;
            char[][] processed = new char[grid.length][grid[0].length];
            int ans = 0;
            for(int i = 0; i<grid.length; i++){
                for(int j =0; j<grid[i].length; j++){
                    if (grid[i][j] == '1' && processed[i][j] == '\u0000'){
                        ans++;
                        processNeighbors(grid, i,j, processed);
                    }
                }
            }
            return ans;
        }

        public void processNeighbors(char[][] grid, int i, int j, char[][] processed){
            if(i>0&& grid[i -1][j]== '1' && processed[i-1][j] == '\u0000'){
                processed[i-1][j] = '1';
                processNeighbors(grid, i-1,j, processed);
            }

            if (i<=grid.length-2 && grid[i+1][j]== '1' && processed[i+1][j] == '\u0000'){
                processed[i+1][j] ='1';
                processNeighbors(grid, i+1,j, processed);
            }

            if (j>0 && grid[i][j-1]== '1' && processed[i][j-1] =='\u0000'){
                processed[i][j-1] = '1';
                processNeighbors(grid, i,j-1, processed);
            }

            if (j<=grid[i].length-2 &&grid[i][j+1]== '1' && processed[i][j+1] =='\u0000'){
                processed[i][j+1] ='1';
                processNeighbors(grid, i,j+1, processed);
            }

        }
    }
}
