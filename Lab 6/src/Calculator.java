/*
*Godiraone
*18001321
*Lab 6
 */

public class Calculator {

    // Instance variable keeps track of multiply calls
    private int callCount = 0;

    // Static method belongs to the class
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method belongs to an object
    public int multiply(int a, int b) {

        // Increase call count whenever multiply is used
        callCount++;

        return a * b;
    }

    // Returns the current call count
    public int getCallCount() {
        return callCount;
    }

    public static void main(String[] args) {

        // Static method called using class name
        System.out.println("Add: " + add(4, 6));

        // Create Calculator object
        Calculator calc = new Calculator();

        System.out.println("Multiply: " + calc.multiply(3, 5));
        System.out.println("Multiply: " + calc.multiply(2, 4));

        // Display number of times multiply was called
        System.out.println("multiply() called "
                + calc.getCallCount() + " times");
    }
}