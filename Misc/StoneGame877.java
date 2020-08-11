package Misc;

public class StoneGame877 {
    class Solution {
        public boolean stoneGame(int[] piles) {
            // assuming that the whole pile is invisible but the edges this solution works ¯\_(ツ)_/¯
//         int begin = 0;
//         int alex = 0;
//         int lee = 0;
//         boolean isAlexTurn = true;
//         int end =  piles.length -1;
//         while(begin <= end){
//             int curr;
//             if(piles[begin] > piles[end]){
//                 curr = piles[begin++];
//             } else {
//                 curr = piles[end--];
//             }
//             if(isAlexTurn){
//                 alex+= curr;
//             } else {
//                 lee+= curr;
//             }
//             isAlexTurn = !isAlexTurn;
//         }
//         return  alex > lee;
            return true; // <- mathematically there's no way alex will lose if she plays optimally
        }
    }
}
