/*
*Godiraone Sefofu
*18001321
*Lab 4
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        String cleaned = text.toLowerCase();

        cleaned = cleaned.replace(" ", "");

        String reversed = "";
        for (int i = cleaned.length() -1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Prints whether or not it is a palindrome

        if (cleaned.equals(reversed)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }

        input.close();
      }
    }
    

