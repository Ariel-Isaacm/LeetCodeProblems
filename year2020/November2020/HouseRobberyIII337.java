package year2020.November2020;

import Misc.TreeNode;

public class HouseRobberyIII337 {
    class Solution {
        public int rob(TreeNode root) {
            int[] ret = helper(root);
            return Math.max(ret[0], ret[1]);
        }

        private int[] helper(TreeNode node) {
            if (node == null) {
                return new int[]{0, 0};
            }
            int[] left = helper(node.left);
            int[] right = helper(node.right);
            int max_included_root = left[1] + right[1] + node.val;
            int left_max = Math.max(left[0], left[1]);
            int right_max = Math.max(right[0], right[1]);
            int max_not_included_root = left_max + right_max;
            return new int[]{max_included_root, max_not_included_root};
        }
    }
}
