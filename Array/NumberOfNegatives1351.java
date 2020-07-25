  
package Array;

import java.util.Arrays;

  public class NumberOfNegatives1351 {
      class Solution {
      public int countNegatives(int[][] grid) {
          int ans = 0;
          for(int i =0; i<grid.length; i++){
              for(int j = 0; j<grid[i].length; j++){
                  if(grid[i][j]<0) ans++; // knowing that the numbers are in decreasing order we could avoid reading those numbers.
              }
          }
          return ans;
      }
  }
}
