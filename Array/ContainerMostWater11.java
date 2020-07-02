package Array;

public class ContainerMostWater11 {
    public int maxArea(int[] height) {
        int down = 0;
        int up = height.length - 1;
        int ans = 0;
        while (up > down) {
            int curr = Math.min(height[up], height[down]) * (up - down);
            if (curr > ans) ans = curr;
            if (height[down] > height[up]) {
                up--;
            } else {
                down++;
            }
        }
        return ans;
    }
}
