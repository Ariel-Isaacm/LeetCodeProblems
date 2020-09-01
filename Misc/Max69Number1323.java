package Misc;

public class Max69Number1323 {
    class Solution {
        //nice
        public int maximum69Number(int num) {
            char[] numbers = ("" + num).toCharArray();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == '6') {
                    numbers[i] = '9';
                    break;
                }
            }

            return Integer.parseInt(String.valueOf(numbers));
        }
    }
}
