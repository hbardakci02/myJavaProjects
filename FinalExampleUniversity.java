import java.util.*;

public class FinalExample {
    public static void main(String[] args) {
        // Ürünleri oluştur
        Product foodProduct = new Food(1, 10, "Apple", "Fresh apple", 0, 50, 0, 10);
        Product clothingProduct = new Clothing(2, 50, "T-shirt", "Cotton T-shirt", 0, "Casual", "M");

        // Müşteriyi oluştur
        Customer customer = new Customer("John Doe", "123456789", "123 Main St", "01/01/1990");

        // Sepet oluştur
        Cart cart = new Cart();

        // Ürünleri sepete ekle
        cart.addProduct(foodProduct, 2);
        cart.addProduct(clothingProduct, 1);

        // Sepeti kontrol et ve ödeme yap
        cart.checkout();
    }

}

class Product {
    public double price;
    public int numericalID;
    public String name, description;
    public double afterDiscountPrice;

    public Product(int numericalID, int price, String name, String description, double afterDiscountPrice) {
        this.numericalID = numericalID;
        this.price = price;
        this.name = name;
        this.description = description;
        this.afterDiscountPrice = afterDiscountPrice;
    }

    public int getNumericalID() {
        return numericalID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double discount(double discountPercentage) {
        afterDiscountPrice = getPrice() * discountPercentage;
        return afterDiscountPrice;
    }
}

class Food extends Product {
    public int calories, fat, crabs;

    public Food(int numericalID, int price, String name, String description, double afterDiscountPrice, int calories,
            int fat, int crabs) {
        super(numericalID, price, name, description, afterDiscountPrice);
        this.calories = calories;
        this.fat = fat;
        this.crabs = crabs;
    }
}

class Clothing extends Product {
    private String style;
    private String size;

    public Clothing(int numericalID, int price, String name, String description, double afterDiscountPrice,
            String style, String size) {
        super(numericalID, price, name, description, afterDiscountPrice);
        this.style = style;
        this.size = size;
    }
}

class Customer {
    private String name;
    private String phoneNumber;
    private String address;
    private String birthdate;

    public Customer(String name, String phoneNumber, String address, String birthdate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthdate = birthdate;
    }
}

class Cart {
    double total = 0;
    HashMap<Product, Integer> productListMap = new HashMap<>();

    public void addProduct(Product product, int count) {
        productListMap.put(product, count);
    }

    public void removeProduct(Product poroduct) {
        productListMap.remove(poroduct);
    }

    public void clearCart() {
        productListMap.clear();
    }

    public void checkout() {

        for (Map.Entry<Product, Integer> pointer : productListMap.entrySet()) {
            Product product = pointer.getKey();
            int count = pointer.getValue();
            double subTotal = product.discount(0.5) * count;
            System.out.println(count + " piece " + product + " Price: " + subTotal);
            total += subTotal;
        }
        System.out.println("Total Price: " + total);

    }

    public void confirmCheckouut() {
        System.out.println("Total Amount: " + total);
        System.out.println("Cart will be clear.");
        productListMap.clear();

    }

}
