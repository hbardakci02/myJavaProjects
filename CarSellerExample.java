import java.util.*;

public class CarSellerExample {

    public static void main(String[] args) {
        // Create some car and motorcycle instances
        Car car1 = new Car(1, "Toyota Corolla", 20000, "Petrol", 4);
        Car car2 = new Car(2, "Honda Civic", 22000, "Petrol", 4);
        Motorcycle moto1 = new Motorcycle(3, "Harley Davidson", 15000, 1.2, false);
        Motorcycle moto2 = new Motorcycle(4, "Ducati Monster", 18000, 1.0, false);
        
        // Create a customer
        Customer customer = new Customer("John Doe", "john@example.com", "1234567890", "123 Main St");

        // Create a rental record and add vehicles
        RentalRecord rentalRecord = new RentalRecord();
        rentalRecord.addVehicle(car1, 1);
        rentalRecord.addVehicle(car2, 2);
        rentalRecord.addVehicle(moto1, 1);
        rentalRecord.addVehicle(moto2, 1);

        // Confirm rental to see the details
        rentalRecord.confirmRental();

        // Try removing a vehicle and handling the exception
        try {
            rentalRecord.removeVehicle(car1);
        } catch (VehicleNotFoundException e) {
            System.out.println(e);
        }

        // Clear the record
        rentalRecord.clearRecord();
    }

}

class Vehicle {
    private int vehicleID;
    private String model;
    private double price;

    public Vehicle(int vehicleID, String model, double price) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.price = price;
    }

    public double applyDis(double discount) {
        double afterDis = getPrice() * discount;

        return getPrice() - afterDis;
    }

    public int getVehicleID() {
        return this.vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}

class Car extends Vehicle {
    private String fuelType;
    private int numberOfDoors;

    public Car(int vehicleID, String model, double price, String fuelType, int numberOfDoors) {
        super(vehicleID, model, price);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

}

class Motorcycle extends Vehicle {
    private double engineCap;
    private boolean hasSideCar;

    public Motorcycle(int vehicleID, String model, double price, double engineCap, boolean hasSideCar) {
        super(vehicleID, model, price);
        this.engineCap = engineCap;
        this.hasSideCar = hasSideCar;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public double getEngineCap() {
        return this.engineCap;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public boolean getHasSideCar() {
        return this.hasSideCar;
    }

}

class Customer {
    private String name;
    private String eMail;
    private String phoneNumber;
    private String address;

    public Customer(String name, String eMail, String phoneNumber, String address) {
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

class RentalRecord {
    HashMap<Vehicle, Integer> hashMapCar = new HashMap<>();

    public void addVehicle(Vehicle vehicle, int count) {
        hashMapCar.put(vehicle, count);
    }

    public void removeVehicle(Vehicle vehicle) {
        if (hashMapCar.containsKey(vehicle)) {
            hashMapCar.remove(vehicle);
        } else
            throw new VehicleNotFoundException("Vehicle dorsn't found.");
    }

    public void clearRecord() {
        hashMapCar.clear();
    }

    public void confirmRental() {
        for (Map.Entry<Vehicle, Integer> element : hashMapCar.entrySet()) {
            Vehicle vehicle = element.getKey();
            System.out.println("Vehicle: " + vehicle.getModel());
            vehicle.applyDis(0.1);
            System.out.println("Price: " + vehicle.getPrice());
        }
        hashMapCar.clear();
    }

}

class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String message) {
        super(message);
    }

    public String toString() {
        return "VehicleNotFoundException: " + getMessage();
    }
}
