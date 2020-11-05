package Array;

public class CellOddValues1252 {
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {

            int[] row = new int[n];
            int[] col = new int[m];
            for (int[] index : indices) {
                row[index[0]]++;
                col[index[1]]++;
            }

            int[] rowEO = findOddAndEven(row);
            int[] colEO = findOddAndEven(col);
            return rowEO[0] * colEO[1] + rowEO[1] * colEO[0];

        }

        private int[] findOddAndEven(int[] input) {
            int[] output = new int[2];
            for (int i : input) output[(i % 2 == 0 ? 1 : 0)]++;
            return output;
        }
    }

}
