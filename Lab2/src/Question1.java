/*Godiraone Sefofu
*18001321
*Lab 2
*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a numeric score
        System.out.print("Enter a numeric score between 0 and 100: ");
        double score = scanner.nextDouble();

        //Validating the input score
        char grade;
        if (score >= 80 && score <= 100) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //print the letter grade
        System.out.println("The letter grade for a score of " + score + " is: " + grade);

        scanner.close();
    }
}