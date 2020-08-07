package Trees;

import Misc.TreeNode;

public class ClosestToTarget {
    public int closestToTarget(TreeNode root, double target) {
        return helper(root, target, root.val);
    }

    private int helper(TreeNode node, double target, int closest) {
        if (node != null) {
            if (Math.abs(node.val - target) < Math.abs(closest - target)) {
                closest = node.val;
            }
            if (node.val > target) {
                closest = helper(node.left, target, closest);
            } else {
                closest = helper(node.right, target, closest);
            }
        }
        return closest;
    }
}
