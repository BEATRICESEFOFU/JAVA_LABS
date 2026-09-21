/*
*Godiraone
*18001321
*Lab 6
 */

public class Question1 {

    // Method that checks whether a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0; // Returns true if remainder is 0
    }

    public static void main(String[] args) {

        // Call the method with different values
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(10));
    }
}