/*
3. Hierarchical Inheritance
Hierarchical inheritance occurs when multiple classes inherit from the same superclass.
*/

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();    // Inherited from Animal
        dog.bark();   // Defined in Dog

        Cat cat = new Cat();
        cat.eat();    // Inherited from Animal
        cat.meow();   // Defined in Cat
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
                        System.out.println("");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
                        System.out.println("");
    }
}

/*
This animal eats food.
The dog barks.

This animal eats food.
The cat meows.
*/
