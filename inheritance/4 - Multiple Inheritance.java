/*
4. Multiple Inheritance (Interface Inheritance)
Java does not support multiple inheritance directly through classes, but you can achieve multiple inheritance through interfaces. A class can implement more than one interface.
*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Implemented from Animal interface
        dog.play(); // Implemented from Pet interface
    }
}


interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }
    
    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

/*
Output:

The dog eats food.
The dog plays with a ball.

*/