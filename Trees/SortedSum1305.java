package Trees;

import Misc.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSum1305 {
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            // not really happy with his solution since O((n+m)log(n+m)) n=root1's size m=root2'size
            // and space complexity of (n+m)
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

        // this solution is somewhat more efficient, but it's more complex in terms of readability
        // O(n+m) time complexity
        // O(n+m) space complexity
        //public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //        List<Integer> first = new ArrayList<>();
        //        List<Integer> second = new ArrayList<>();
        //        List<Integer>  ans = new ArrayList<>();
        //        dfs(root1, first);
        //        dfs(root2, second);
        //        while(!first.isEmpty() || !second.isEmpty()){
        //            if(first.isEmpty() && !second.isEmpty()){
        //               ans.add(second.remove(0));
        //            }
        //            else if(second.isEmpty() && !first.isEmpty()){
        //                ans.add(first.remove(0));
        //            } else if(first.get(0) < second.get(0)){
        //                ans.add(first.remove(0));
        //            } else {
        //                ans.add(second.remove(0));
        //            }
        //
        //        }
        //        return ans;
        //    }
        //
        //    private void dfs(TreeNode node, List<Integer> val){
        //        if(node == null) return;
        //        dfs(node.left, val);
        //        val.add(node.val);
        //        dfs(node.right, val);
        //    }
    }
}
