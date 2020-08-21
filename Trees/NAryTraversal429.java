package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NAryTraversal429 {
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) return ans;
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                int children = queue.size();
                List<Integer> curr = new ArrayList<>();
                while (children > 0) {
                    Node node = queue.pop();
                    curr.add(node.val);
                    queue.addAll(node.children);
                    children--;
                }
                ans.add(curr);

            }

            return ans;
        }
    }
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
}
