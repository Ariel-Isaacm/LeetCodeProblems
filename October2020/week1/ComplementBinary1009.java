package October2020.week1;

public class ComplementBinary1009 {
    class Solution {
        public int bitwiseComplement(int N) {
            String bin = Integer.toBinaryString(N);
            StringBuilder complement = new StringBuilder();
            for (char c : bin.toCharArray()) {

                if (c == '1') {
                    complement.append('0');
                } else {
                    complement.append('1');
                }
            }

            return Integer.parseInt(complement.toString(), 2);
        }
    }
}
