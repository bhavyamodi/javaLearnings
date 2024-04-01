package Abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("The Dog eats the cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking !!");
    }
}
