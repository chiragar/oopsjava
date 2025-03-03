/*
2. Multilevel Inheritance
Multilevel inheritance occurs when a class is derived from another class, which is also derived from another class, forming a chain.
*/
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.sleep(); // Defined in Puppy
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

class Puppy extends Dog {
    void sleep() {
        System.out.println("The puppy sleeps.");
    }
}

/*
Output:

This animal eats food.
The dog barks.
The puppy sleeps.

*/

