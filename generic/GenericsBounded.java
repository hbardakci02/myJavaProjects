package generic;

class GenericsBounded<T extends Number> {
    private T number;

    public GenericsBounded(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        GenericsBounded<Integer> intBox = new GenericsBounded<Integer>(10);
        System.out.println(intBox.doubleValue());

        GenericsBounded<Double> doubleBox = new GenericsBounded<Double>(10.5);
        System.out.println(doubleBox.doubleValue());

    }
}
