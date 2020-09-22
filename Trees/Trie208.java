package Trees;

import java.util.HashMap;

public class Trie208 {
    class Trie {
        private class Node {
            HashMap<Character, Node> mappedNodes = new HashMap<>();
            boolean isCompleteWord = false;
        }

        private Node head;

        public Trie() {
            head = new Node();
        }

        public void insert(String word) {
            Node currentNode = head;
            for (char c : word.toCharArray()) {
                if (currentNode.mappedNodes.containsKey(c)) {
                    currentNode = currentNode.mappedNodes.get(c);
                } else {
                    Node newNode = new Node();
                    currentNode.mappedNodes.put(c, newNode);
                    currentNode = newNode;
                }
            }
            currentNode.isCompleteWord = true;
        }

        public boolean search(String word) {
            Node currentNode = head;
            currentNode = isOnTree(word, currentNode);
            return currentNode != null && currentNode.isCompleteWord;
        }

        public boolean startsWith(String prefix) {
            Node currentNode = head;
            return isOnTree(prefix, currentNode) != null;
        }

        private Node isOnTree(String word, Node currentNode) {
            for (char c : word.toCharArray()) {
                if (!currentNode.mappedNodes.containsKey(c)) {
                    return null;
                }
                currentNode = currentNode.mappedNodes.get(c);
            }
            return currentNode;
        }
    }
}
