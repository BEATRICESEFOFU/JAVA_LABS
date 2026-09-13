/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int length = sentence.length();
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        boolean containsJava = sentence.contains("Java");

        System.out.println("Length: " + length);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);
        System.out.println("Contains \"Java\": " + containsJava);

        sc.close();
    }
}