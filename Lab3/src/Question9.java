/*Godiraone Sefofu
*18001321
*Lab 3
 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number:");
        int number = scanner.nextInt();

        long factorial = 1;

        //
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + " is " + factorial);

        scanner.close();
    }
}

