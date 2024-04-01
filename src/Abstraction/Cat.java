package Abstraction;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("The Cat eats the rat");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing...");
    }
}
