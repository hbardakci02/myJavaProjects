package generic;

public class GenericMultipleParameters<K, V> {
    private K key;
    private V value;

    public GenericMultipleParameters(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

class Main {
    public static void main(String[] args) {
        GenericMultipleParameters<Integer, String> pair = new GenericMultipleParameters<Integer, String>(1111,
                "hsynbrdkc");
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}
