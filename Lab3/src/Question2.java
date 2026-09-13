/*Godiraone Sefofu
*18001321
*Lab 3
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter a whole number
        System.out.print("Enter a positive whole number:");
        int number = scanner.nextInt();

        int sum = 0;
        int current = 1;

        // Calculate and print the sum of all whole numbers from 1 up to that number 
        while (current <= number) {
            sum += current;
            current++;
            
        }
        System.out.println("The sum of all whole numbers from 1 to " + number + " is " + sum);

        scanner.close();
    }
}
    

