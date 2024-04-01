package Abstraction;

public class AnimalTest {
    public static void main(String[] args){
        //Creating instances of Animal
        Animal bird = new Bird();
        Animal cat = new Cat();
        Animal dog = new Dog();

        //Calling methods on each animal
        System.out.println("Bird");
        bird.eat();
        bird.makeSound();

        System.out.println("Cat");
        cat.eat();
        cat.makeSound();

        System.out.println("Dog");
        dog.eat();
        dog.makeSound();
   }
}
