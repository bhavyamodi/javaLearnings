public class Vehicle {
    //Define a class hierarchy for different types of vehicles,
    // such as "Vehicle" being the superclass and "Car", "Motorcycle", and "Truck" being subclasses.
    // Implement specific properties and methods for each subclass,
    // while inheriting common properties and methods from the superclass.

    private String brand;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
    }
}

// Car subclass
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number of doors: " + getNumberOfDoors());
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    private String type;

    // Constructor
    public Motorcycle(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }

    // Getter and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method to display motorcycle details
    public void displayMotorcycleDetails() {
        displayDetails();
        System.out.println("Type: " + getType());
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double loadCapacity;

    // Constructor
    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    // Getter and setter for loadCapacity
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck details
    public void displayTruckDetails() {
        displayDetails();
        System.out.println("Load capacity: " + getLoadCapacity() + " tons");
    }
}

