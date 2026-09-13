/*Godiraone Sefofu
*18001321
*Lab 3
 */
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        int vowelCount = 0;

        // Using a for loop to count and print how many vowels it contains
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}

