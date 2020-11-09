package November2020;

import Misc.TreeNode;

public class BinaryTreeTilt563 {
    class Solution {
        int ans = 0;

        public int findTilt(TreeNode root) {
            tilt(root);
            return ans;
        }

        private int tilt(TreeNode root) {
            if (root == null) return 0;
            int leftSum = tilt(root.left);
            int rightSum = tilt(root.right);
            ans += Math.abs(leftSum - rightSum);
            return leftSum + rightSum + root.val;
        }
    }
}
