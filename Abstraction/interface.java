/*
An interface in Java defines a contract with abstract methods (and default methods from Java 8), and a class can implement multiple interfaces.

• Can have only abstract methods
• class can implement multiple interfaces.
• Cannot have constructors.
• All methods are implicitly public.
• Cannot have instance variables, only constants (public static final).
*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: The dog barks.
        dog.eat();    // Output: This animal eats food.
    }
}

interface Animal {
    // Abstract method (no body)
    void sound();

    // Default method (from Java 8 onwards)
    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
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
