package December2020;

import Misc.TreeNode;

import java.util.LinkedList;

public class MaxDepth104 {

    class Solution {
        public int maxDepth(TreeNode root) {
            // leetcode's statistics showed that dfs was better in terms of speed (1ms vs 0ms)
            if(root == null) return 0;
            return bfs(root);
            // return dfs(root, 0);
        }
        private int dfs(TreeNode node, int depth){
            if(node == null) return depth;
            depth++;
            return Math.max(dfs(node.left, depth), dfs(node.right, depth));
        }

        private int bfs(TreeNode root){
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            int ans = 0;
            while(!queue.isEmpty()){
                int size = queue.size();
                ans++;
                while(size > 0){
                    TreeNode node = queue.pop();
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                    size--;
                }
            }
            return ans;

        }
    }
}
