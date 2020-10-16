package String;

import java.util.*;

public class BuddyString859 {

    public class GroupAnagrams49 {
        class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                if (strs == null || strs.length == 0) return Collections.emptyList();
                List<List<String>> ans = new ArrayList<>();
                HashMap<String, List<String>> map = new HashMap<>();
                for (String str : strs) {
                    char[] r = str.toCharArray();
                    Arrays.sort(r);
                    String joined = new String(r);
                    if (map.containsKey(joined)) {
                        map.get(joined).add(str);
                    } else {
                        List<String> curr = new ArrayList<>();
                        curr.add(str);
                        map.put(joined, curr);
                    }
                }

                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    ans.add(entry.getValue());
                }
                return ans;
            }
        }
    }
}
