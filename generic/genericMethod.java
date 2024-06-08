package generic;

public class genericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");

        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArray(intArray);
        System.out.println("");
        String[] stringArray = { "A", "B", "C", "D", "E" };
        printArray(stringArray);

    }

}