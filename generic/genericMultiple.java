public class genericMultiple {
    public static <T extends Number> double multiple(T x, T y) {

        return x.doubleValue() + y.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(multiple(12.5, 22));
    }
}
