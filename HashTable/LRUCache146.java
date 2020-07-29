package HashTable;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LRUCache146 {

    class LRUCache {
        LinkedHashSet<Integer> memory;
        HashMap<Integer, Integer> data;
        private int capacity;
        public LRUCache(int capacity) {
            memory = new LinkedHashSet();
            data = new HashMap();
            this.capacity = capacity;
        }

        public int get(int key) {
            if (!data.containsKey(key)){
                return -1;
            }
            int val = data.get(key);
            memory.remove(key);
            memory.add(key);
            return val;
        }

        public void put(int key, int value) {
            if (memory.size() == capacity && !data.containsKey(key)){
                // remove eldest
                int keyToDelete = memory.stream().findFirst().get();
                memory.remove(keyToDelete);
                data.remove(keyToDelete);
            }
            if (data.containsKey(key)){
                memory.remove(key);
            }
            memory.add(key);
            data.put(key, value);
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
