package RandomExample;

import java.util.*;

public class ElectronicsSellerExample {
    public static void main(String[] args) {
        // Müşteri oluştur
        Customer customer = new Customer("John Doe", "john@example.com", "2024-06-09", "123 Main St");

        // Elektronik ürün ve kitap oluştur
        Electronics laptop = new Electronics("Laptop", "E123", "Laptop", "15-inch Laptop", 1000.0, true, "BrandX");
        Book book = new Book("Book", "B456", "Book", "Java Programming", 50.0, "AuthorY", "ISBN123");

        // Sipariş oluştur ve ürünleri ekle
        Order order = new Order("ORD001", "2024-06-09", 0.0);
        order.addItem(laptop, 1);
        order.addItem(book, 2);

        // Siparişi onayla

        // Siparişi sonlandır
        order.finalizeOrder();
        order.confirmOrder();
    }
}

class Order {
    private String orderID;
    private String orderDate;
    private double totalAmount;

    HashMap<Item, Integer> itemMap = new HashMap<>();

    public Order(String orderID, String orderDate, double totalAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public void addItem(Item item, int count) {
        itemMap.put(item, count);
    }

    public void removeItem(Item item) throws ItemNotFoundException {
        if (itemMap.containsKey(item)) {
            itemMap.remove(item);
        } else {
            throw new ItemNotFoundException("Item doesn't exist.");
        }
    }

    public void clearItem() {
        itemMap.clear();
    }

    public void finalizeOrder() {
        for (Map.Entry<Item, Integer> myEntry : itemMap.entrySet()) {
            Item myItem = myEntry.getKey();
            int count = myEntry.getValue();
            System.out.println("Product: " + myItem.getName() + ", Count: " + count);
            totalAmount += myItem.applyDiscount(0.1) * count;
        }
        System.out.println("Total Amount: " + totalAmount);
    }

    public void confirmOrder() {
        itemMap.clear();
        System.out.println("Order Confirmed. Total Amount: " + totalAmount);
    }

}

class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message) {
        super(message);
    }

    public String toString() {
        return "ItemNotFoundException: " + getMessage();
    }

}

class Item {
    private String orderItem;
    private String ID;
    private String name;
    private String description;
    private double price;

    public Item(String ordeItem, String ID, String name, String description, double price) {
        this.orderItem = ordeItem;
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double applyDiscount(double discount) {
        double afterDisc = getPrice() - (getPrice() * discount);
        return afterDisc;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }

}

class Electronics extends Item {
    private boolean warranty;
    private String brand;

    public Electronics(String ordeItem, String ID, String name, String description, double price, boolean warranty,
            String brand) {
        super(ordeItem, ID, name, description, price);
        this.warranty = warranty;
        this.brand = brand;
    }

}

class Book extends Item {
    private String author;
    private String ISBN;

    public Book(String ordeItem, String ID, String name, String description, double price, String author, String ISBN) {
        super(ordeItem, ID, name, description, price);
        this.author = author;
        this.ISBN = ISBN;
    }

}

class Customer {
    private String name;
    private String eMail;
    private String registerDate;
    private String address;

    public Customer(String name, String eMail, String registerDate, String address) {
        this.name = name;
        this.eMail = eMail;
        this.registerDate = registerDate;
        this.address = address;
    }
}
