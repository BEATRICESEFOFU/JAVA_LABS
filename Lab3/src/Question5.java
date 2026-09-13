/*Godiraone Sefofu
*18001321
*Lab 3
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Implement a do-while loop that prompts the user to enter a number between 1 and 10 until they enter a valid number
        do {
            System.out.print("Enter a number between 1 and 10:");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid input. Please try again.");
            }

        } while (number < 1 || number > 10);

        System.out.println("You entered: "+ number);

        scanner.close();
    }
}
    

