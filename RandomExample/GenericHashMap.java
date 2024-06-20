package RandomExample;

import java.util.ArrayList;

public class GenericHashMap<K extends Number, V> {
    private K key;
    private V value;
    private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    public GenericHashMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void put(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V get(K key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                return values.get(i);
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                keys.remove(i);
                values.remove(i);
            }
        }
    }

    public void clear() {
        keys.clear();
        values.clear();
    }

    public int size() {
        return keys.size();
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public boolean containsKey(K key) {
        return keys.contains(key);
    }

    public boolean containsValue(V value) {
        return values.contains(value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericHashMap<Integer, String> genericHashMap = new GenericHashMap<>(1, "One");
        System.out.println("Key: " + genericHashMap.getKey() + " Value: " + genericHashMap.getValue());
    }

}
