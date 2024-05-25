package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.*;

public class dictionary {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String, String> dictionar = new HashMap<String, String>();
        dictionar.put("Elma", "Apple");
        dictionar.put("Kalem", "Pen");
        dictionar.put("Kitap", "Book");
        dictionar.put("Saat", "Clock");
        PrintStream write;
        try {
            write = new PrintStream("D:\\sözlük\\sözlük.txt");
            ObjectOutputStream dwrite = new ObjectOutputStream(write);
            dwrite.writeObject(dictionar);
            dwrite.close();

            FileInputStream fRead = new FileInputStream("D:\\sözlük\\sözlük.txt");
            ObjectInputStream dRead = new ObjectInputStream(fRead);
            System.out.println("My dictionary: " + dRead.readObject());
            dRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
