package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedByPower1387 {
    class Solution {
        public int getKth(int lo, int hi, int k) {
            List<List<Integer>> values = new ArrayList<>();
            for (int i = lo; i <= hi; i++) {
                List<Integer> powers = new ArrayList<>();
                powers.add(i);
                powers.add(getPower(i));
                values.add(powers);
            }
            values.sort(Comparator.comparing(n -> n.get(1)));
            return values.get(k - 1).get(0);
//            return IntStream.range(lo, hi+1).boxed().sorted(Comparator.comparing(this::getPower, Integer::compareTo)).collect(Collectors.toList()).get(k-1);
        }

        public int getPower(int x) {
            int pow = 1;
            while (x != 1) {
                if (x % 2 == 0) {
                    x /= 2;
                } else {
                    x = (3 * x) + 1;
                }
                pow++;
            }
            return pow;
        }
    }
}
