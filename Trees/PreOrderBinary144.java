package Trees;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderBinary144 {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            return helper(root, new ArrayList());
        }

        public List<Integer> helper(TreeNode node, List<Integer> ans){
            if (node != null){
                ans.add(node.val);
                helper(node.left, ans);
                helper(node.right, ans);
            }
            return ans;
        }
    }
}
