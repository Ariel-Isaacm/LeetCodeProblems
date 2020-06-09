package Trees;

import java.util.ArrayList;
import java.util.List;

public class TreePostOrder590 {


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

    class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> ans = new ArrayList();
            checkTree(root, ans);
            return ans;
        }

        public void checkTree(Node node, List<Integer> ans){
            if (node == null) return;
            for(Node child : node.children){
                checkTree(child, ans);
            }
            ans.add(node.val);
        }
    }
}
