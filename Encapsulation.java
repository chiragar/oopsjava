/*
Encapsulation is the OOP concept of restricting access to an object's internal state 
by making fields private and providing controlled access 
via public getter and setter methods.
*/

// Main class to demonstrate encapsulation
public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();

        // Using setter methods to set values
        person.setName("Alice");
        person.setAge(25);

        // Using getter methods to get values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-5);  // This will show the validation message
    }
}

// Class to represent a simple Person with encapsulation
public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
}

/*
Output:
Name: Alice
Age: 25
Age cannot be negative or zero.
*/
