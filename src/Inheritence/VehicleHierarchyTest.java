package Inheritence;

import Inheritence.Car;
import Inheritence.Motorcycle;
import Inheritence.Truck;

// Main class to test the vehicle hierarchy
public class VehicleHierarchyTest {
    public static void main(String[] args) {
        // Creating instances of different types of vehicles
        Car car = new Car("Toyota", "Camry", 2020, 4);

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2019, "Cruiser");
        Truck truck = new Truck("Ford", "F-150", 2018, 2.5);

        // Displaying details of each vehicle
        System.out.println("Inheritence.Car details:");
        car.displayCarDetails();

        System.out.println("\nInheritence.Motorcycle details:");
        motorcycle.displayMotorcycleDetails();

        System.out.println("\nInheritence.Truck details:");
        truck.displayTruckDetails();
    }
}
