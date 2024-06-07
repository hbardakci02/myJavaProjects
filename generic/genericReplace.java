package generic;

public class genericReplace {
    public static <T> void replace(T x, T y) {
        T empty = x;
        x = y;
        y = empty;
        System.out.println("After replace-> First: " + x + ", Second: " + y);
    }

    public static void main(String[] args) {
        replace(123, "Ahmet");
    }

}
