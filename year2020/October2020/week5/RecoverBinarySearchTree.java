import Misc.TreeNode;

class Solution {
    TreeNode x, y, prev;
    public void recoverTree(TreeNode root) {
        if (root == null) return;
        find(root);
        swap(x, y);
    }
		

    public void find(TreeNode root) {
        if (root == null) return;
        find(root.left);
		if (prev != null && prev.val > root.val) {
            y = root;
            if (x == null) {
                x = prev;
            } else {
                return;
            }
        }
        prev = root;
        find(root.right);
    }
    
    private void swap(TreeNode one, TreeNode two) {
        int tmp = one.val;
        one.val = two.val;
        two.val = tmp;
    }
}
