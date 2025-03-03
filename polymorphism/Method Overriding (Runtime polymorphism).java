/*
► Method Overriding (Runtime polymorphism): 
• Same method signature in both parent and child classes, but the method in the child class overrides the parent class method.
*/
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myDog = new Dog();        // Animal reference but Dog object
        Animal myCat = new Cat();        // Animal reference but Cat object

        myAnimal.sound(); // Outputs: Animal makes a sound
        myDog.sound();    // Outputs: Dog barks
        myCat.sound();    // Outputs: Cat meows
    }
}

class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method overriding in the subclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

/*
Output:

Animal makes a sound
Dog barks
Cat meows

*/