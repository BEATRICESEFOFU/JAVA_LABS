/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for three different types of input

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        System.out.print("Enter a single word: ");
        String word = sc.next();

        System.out.println("You entered  " + number + ", " + decimalNumber + ", and the word \"" + word + "\".");

        sc.close();
}
    
}
