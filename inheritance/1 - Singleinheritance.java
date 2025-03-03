/*
1. Single Inheritance
Single inheritance occurs when a class inherits from only one superclass.

*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.bark();  // Defined in Dog
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

/*
Ouput:
This animal eats food.
The dog barks.


*/