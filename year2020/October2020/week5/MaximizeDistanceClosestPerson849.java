package year2020.year2020.October2020.week5;

public class MaximizeDistanceClosestPerson849 {
    public int maxDistToClosest(int[] seats) {
        int max = Integer.MIN_VALUE;
        int anchor = 0;
        // left
        if (seats[0] == 0) {
            for (int i = 1; i < seats.length; i++) {
                if (seats[i] == 1) {
                    max = i;
                    anchor = i;
                    break;
                }
            }
        }

        // middle
        for (int i = anchor + 1; i < seats.length; i++) {
            if (seats[i] == 1) {
                max = Math.max(max, (i - anchor) / 2);
                anchor = i;
            }
        }

        //right
        if (seats[seats.length - 1] == 0) {
            max = Math.max(max, ((seats.length - 1) - anchor));
        }
        return max;
    }
}
