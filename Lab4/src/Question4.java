/*
*Godiraone Sefofu
*18001321
*Lab 4
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to enter a whole number
        System.out.print("Enter a whole number:");
        int number = input.nextInt();

        int original = number;

        // Printing that number's binary representation
        if (number == 0) {
            System.out.println("The binary representation of 0 is 0");
            input.close();
            return;
        }
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }

        String binary ="";

        //
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        if (isNegative) {
            binary = "-" + binary;
        }

        System.out.println("The binary representation of " + original + " is" + binary);

        input.close();
    }
}