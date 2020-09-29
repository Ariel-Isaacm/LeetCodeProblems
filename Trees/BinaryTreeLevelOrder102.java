package Trees;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrder102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return Collections.emptyList();
            LinkedList<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            queue.add(root);
            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> currLevel = new ArrayList<>();

                while (size > 0) {
                    TreeNode node = queue.pop();
                    currLevel.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    size--;
                }
                ans.add(currLevel);
            }
            return ans;
        }
    }
}