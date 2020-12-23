package year2020.October2020.week3;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int prev = nums[i];
            do {
                int next = (current + k) % nums.length;
                int aux = nums[next];
                nums[next] = prev;
                prev = aux;
                current = next;
                count++;
            } while (i != current);
        }
    }
}
