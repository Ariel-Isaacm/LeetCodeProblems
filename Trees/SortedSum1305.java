package Trees;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSum1305 {
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> ans = new ArrayList();
            helper(root1, ans);
            helper(root2, ans);
            Collections.sort(ans);
            return ans;
        }

        public void helper(TreeNode node, List<Integer> ans) {
            if (node != null) {
                helper(node.left, ans);
                helper(node.right, ans);
                ans.add(node.val);
            }
        }
    }
}
