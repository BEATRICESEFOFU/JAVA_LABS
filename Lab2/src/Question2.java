/*Godiraone Sefofu
*18001321
*Lab 2
*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        //Prompt the user to enter a letter to check if their name starts with it
        System.out.print("Enter a letter to check if your name starts with it: ");
        String letterInput = scanner.nextLine();
        char letter = letterInput.charAt(0);

        int totalCharacters = fullName.length();
        String upperCaseName = fullName.toUpperCase();
        String lowerCaseName = fullName.toLowerCase();

        boolean startsWithLetter = false;
        if (fullName.length() > 0) {
            char firstChar = fullName.charAt(0);
            startsWithLetter = Character.toLowerCase(firstChar) == Character.toLowerCase(letter);
        }

        // Display the results
        System.out.println("Total number of characters (including spaces): " + totalCharacters);
        System.out.println("Uppercase: " + upperCaseName);
        System.out.println("Lowercase: " + lowerCaseName);
        System.out.println("Does the name start with '" + letter + "'? " + startsWithLetter);

        scanner.close();
    }
}
    

