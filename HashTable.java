import java.util.LinkedList;

public class HashTable <K,V>{
    private int length = 16;
    private int size = 0; 
    private LinkedList<Entry<K, V>>[] table = (LinkedList<Entry<K, V>>[]) new LinkedList[16];
    public int Hash(K Key) {
        return Key.hashCode() % length;
    } 

    public void put(K key, V value) {
        int index = Hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        size++;
    }

    public V get(K key) { 
        int index = Hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }
        public void remove(K key) {
            int index = Hash(key);
            for(Entry<K,V> i : table[index]) {
                if(i.getKey().equals(key)) {
                    table[index].remove(i);
                    size--;
                }
            }
        }
        public int size() {
            return size;
        }
        public boolean isEmpty() {
            return size == 0;
        }
    }

