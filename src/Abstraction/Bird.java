package Abstraction;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("The bird eats insects");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping !");
    }
}
