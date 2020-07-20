package String;

public class RobotReturn657 {
    class Solution {
        public boolean judgeCircle(String moves) {
            if (moves == null || moves.length() == 0) return false;
            int x = 0;
            int y = 0;
            for (int i = 0; i < moves.length(); i++) {
                char direction = moves.charAt(i);
                if (direction == 'U') {
                    y++;
                } else if (direction == 'D') {
                    y--;
                } else if (direction == 'R') {
                    x++;
                } else if (direction == 'L') {
                    x--;
                }
            }
            return x == 0 && y == 0;
        }
    }
}
