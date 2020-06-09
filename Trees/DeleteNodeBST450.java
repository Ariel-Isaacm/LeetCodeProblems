package Trees;

public class DeleteNodeBST450 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            return searchAndDestroy(root, key);
        }

        public TreeNode searchAndDestroy(TreeNode node, int key) {
            if (node == null)return null;
            if(node.val > key){
                node.left  = searchAndDestroy(node.left, key);
            } else if(node.val < key){
                node.right = searchAndDestroy(node.right, key);
            } else {
                if(node.left == null){
                    return node.right;
                } else if (node.right == null){
                    return node.left;
                }
                node.val = findMin(node.right);

                node.right = searchAndDestroy(node.right, node.val);
            }

            return node;
        }

        public int findMin(TreeNode root){
            int min = root.val;
            while (root != null) {
                min = root.val;
                root = root.left;
            }
            return min;
        }
    }
}
