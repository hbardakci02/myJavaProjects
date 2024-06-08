package generic;

public class GenericBox<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setContent("Generics");
        System.out.println(stringBox.getContent());
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setContent(12341);
        System.out.println(integerBox.getContent());
    }
}