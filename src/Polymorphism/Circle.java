package Polymorphism;

class Circle implements ShapeInterface {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
