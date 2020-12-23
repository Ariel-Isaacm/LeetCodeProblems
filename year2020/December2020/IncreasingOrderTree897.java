package year2020.December2020;;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderTree897 {
    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            if (root == null) return null;
            List<Integer> values = new ArrayList<>();
            dfs(root, values);
            TreeNode head = new TreeNode(values.get(0));
            TreeNode curr = head;
            for (int i = 1; i < values.size(); i++) {
                curr.right = new TreeNode(values.get(i));
                curr = curr.right;
            }
            return head;
        }

        private void dfs(TreeNode node, List<Integer> values) {
            if (node == null) return;
            dfs(node.left, values);
            values.add(node.val);
            dfs(node.right, values);
        }
    }
}
