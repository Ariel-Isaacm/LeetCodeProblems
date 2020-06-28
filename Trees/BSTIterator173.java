package Trees;

import Misc.TreeNode;

import java.util.LinkedList;

public class BSTIterator173 {
    class BSTIterator {
        LinkedList<Integer> values;
        public BSTIterator(TreeNode root) {
            values = new LinkedList();
            helper(values, root);
        }

        public void helper(LinkedList<Integer> values, TreeNode root){
            if(root != null){
                helper(values, root.left);
                values.add(root.val);
                helper(values, root.right);
            }
        }

        /** @return the next smallest number */
        public int next() {
            if(!this.values.isEmpty()){
                return values.poll();
            }
            return -1; //throw exception?
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !values.isEmpty();
        }
    }
}
