package Polymorphism;

import Polymorphism.ShapeInterface;

class Triangle implements ShapeInterface {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
