package generic;

import java.util.Scanner;

public class genericPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What you want to print ?");
        Object object = scan.next();

        Test<Object> myObj = new Test<Object>(object);
        System.out.println("Print: " + myObj.getObj());
    }
}

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
