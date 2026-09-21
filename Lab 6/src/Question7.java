/*
*Godiraone
*18001321
*Lab 6
 */

public class Question7 {

    // Attempts to double the value passed in
    public static void tryToDouble(int number) {

        // Only changes the local copy
        number = number * 2;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int value = 10;

        // Pass value to the method
        tryToDouble(value);

        // Original variable remains unchanged
        System.out.println("After method call: " + value);
    }
}