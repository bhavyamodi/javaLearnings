package Polymorphism;

import Polymorphism.Circle;
import Polymorphism.Rectangle;

// Main class to test the Polymorphism.Shape interface and its implementations
public class ShapeTest {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);

        // Calculating and displaying area of each shape
        System.out.println("Area of Polymorphism.Circle: " + circle.calculateArea());
        System.out.println("Area of Polymorphism.Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}