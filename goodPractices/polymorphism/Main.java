package goodPractices.polymorphism;
/*Compile-Time Polymorphism (Method Overloading)
Method overloading allows a class to have multiple methods with the same name but different parameters.
 */
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(2, 3));
        System.out.println("Sum of three integers: " + calc.add(2, 3, 4));
        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.5));
    }
}

