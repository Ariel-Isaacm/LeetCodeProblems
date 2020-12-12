package December2020;

import Misc.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class NodeDeepestLevel865 {
    class SmallestSubtreewithalltheDeepestNodes {
        private Map<TreeNode, Integer> map = new HashMap<>();

        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            if (root == null) {
                return null;
            }
            int leftD = depth(root.left);
            int rightD = depth(root.right);

            if (leftD == rightD) {
                return root;
            } else if (leftD > rightD) {
                return subtreeWithAllDeepest(root.left);
            } else {
                return subtreeWithAllDeepest(root.right);
            }
        }


        private int depth(TreeNode root) {
            if (map.containsKey(root)) {
                return map.get(root);
            }
            if (root == null) {
                return 0;
            }
            int leftD = depth(root.left);
            int rightD = depth(root.right);
            int depth = Math.max(leftD, rightD) + 1;
            map.put(root, depth);
            return depth;
        }
    }
}
