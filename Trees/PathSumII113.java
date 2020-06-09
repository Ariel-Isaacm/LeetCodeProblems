package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathSumII113 {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> ans = new ArrayList();
            if (root == null) return Collections.emptyList();
            checkTree(root, 0, ans, new ArrayList(), sum);
            return ans;
        }

        public void checkTree(TreeNode node, int sum, List<List<Integer>> ans, List<Integer> currentRoute, int originalSum) {
            int current = sum + node.val;
            if (current == originalSum && node.left == null && node.right == null) {
                currentRoute.add(node.val);
                ans.add(currentRoute);
            } else {
                currentRoute.add(node.val);
                if (node.left != null) {
                    checkTree(node.left, current, ans, new ArrayList(currentRoute), originalSum);
                }
                if (node.right != null) {
                    checkTree(node.right, current, ans, new ArrayList(currentRoute), originalSum);
                }
            }
        }
    }
}
