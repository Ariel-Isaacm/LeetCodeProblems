package year2020.October2020.week3;

import java.util.*;

public class CloneGraph133 {
    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null) return null;
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);
            Map<Node, Node> map = new HashMap<Node, Node>();
            map.put(node, new Node(node.val));
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                for (Node neighbor : current.neighbors) {
                    if (!map.containsKey(neighbor)) {
                        map.put(neighbor, new Node(neighbor.val));
                        queue.add(neighbor);
                    }
                    map.get(current).neighbors.add(map.get(neighbor));
                }
            }
            return map.get(node);
        }

        class Node {
            public int val;
            public List<Node> neighbors;

            public Node() {
                val = 0;
                neighbors = new ArrayList<Node>();
            }

            public Node(int _val) {
                val = _val;
                neighbors = new ArrayList<Node>();
            }

            public Node(int _val, ArrayList<Node> _neighbors) {
                val = _val;
                neighbors = _neighbors;
            }
        }
    }
}
