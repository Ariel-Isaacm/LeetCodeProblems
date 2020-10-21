package October2020.week3;

import java.util.Stack;

public class AsteroidCollision735 {
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> rocks = new Stack<>();
            for (int i = 0; i < asteroids.length; i++) {
                int curr = asteroids[i];
                if (curr > 0) {
                    rocks.push(curr);
                } else {
                    while (true) {
                        if (rocks.isEmpty() || rocks.peek() < 0) {
                            rocks.push(curr);
                            break;
                        }
                        int candidate = rocks.peek();
                        if (candidate + curr > 0) {
                            break;
                        } else if (candidate + curr == 0) {
                            rocks.pop();
                            break;
                        } else {
                            rocks.pop();
                        }
                    }
                }
            }

            int[] ans = new int[rocks.size()];
            for (int i = rocks.size() - 1; i >= 0; i--) {
                ans[i] = rocks.pop();
            }
            return ans;
        }
    }
}
