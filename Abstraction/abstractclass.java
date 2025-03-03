/*
Abstract Class
An abstract class is a class that cannot be directly created, but provides a blueprint for other classes to follow, with some methods needing to be defined by those subclasses.

• A class can extend only one abstract class.
• Can have constructors.	
• Can have access modifiers (private, protected, public).
• Can have instance variables (fields).

*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: The dog barks.
        dog.eat();    // Output: This animal eats food.
    }
}

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Regular method
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
}
/*
Output:

The dog barks.
This animal eats food.

*/