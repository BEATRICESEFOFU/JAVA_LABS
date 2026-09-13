/*Godiraone Sefofu
*18001321
*Lab 3
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter a number
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        //Using a for loop to print that number's multiplication table from 1 to 12
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
    

