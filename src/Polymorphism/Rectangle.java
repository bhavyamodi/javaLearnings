package Polymorphism;

class Rectangle implements ShapeInterface {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}
