/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number from 1 to 7 for the day of the week
        System.out.print("Enter a number from 1 to 7 for the day of the week: ");
        int day = scanner.nextInt();

        // Use a switch statement to determine the day of the week based on the input number
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:// Handle invalid input
                System.out.println("Invalid input: please enter a number between 1 and 7.");
                break;
        }

        scanner.close();
    }
}

