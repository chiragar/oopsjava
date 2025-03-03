/*
Compile-time polymorphism (Method Overloading):

Occurs when you have multiple methods with the same name but different parameters (i.e., the method signature is different).
The decision about which method to call is made during compile time.

*/
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15)); // Calls add(int, int, int)
    }
}

class Calculator {
    // Overloaded method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
/*
Output:

15
30 
*/

