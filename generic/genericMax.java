package generic;

public class genericMax {
    public static void main(String[] args) {
        System.out.println(max(123, 2222));
    }

    public static <E extends Comparable<E>> E max(E object1, E object) {

        if (object.compareTo(object1) > 0) {
            return object;
        } else {
            return object1;
        }

    }
}
