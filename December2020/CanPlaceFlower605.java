package December2020;

public class CanPlaceFlower605 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if (flowerbed == null || flowerbed.length < 1) return false;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) {
                    if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }

            return n <= 0;
        }
    }
}
