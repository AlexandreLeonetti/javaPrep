package goodPractices.polymorphism;
/*
 Runtime Polymorphism (Method Overriding)
Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
 */
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class  Animals{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Outputs: Animal makes a sound
        myDog.makeSound();    // Outputs: Dog barks
        myCat.makeSound();    // Outputs: Cat meows
    }
}
