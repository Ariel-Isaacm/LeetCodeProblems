package Trees;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryZigZag103 {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) return Collections.emptyList();
            LinkedList<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            queue.add(root);
            boolean zig = true;
            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> currLevel = new ArrayList<>();

                while (size > 0) {
                    TreeNode node = queue.pop();

                    if (zig) {
                        currLevel.add(node.val);
                    } else {
                        currLevel.add(0, node.val);
                    }
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);

                    size--;
                }
                zig = !zig;
                ans.add(currLevel);
            }
            return ans;

        }
    }
}
