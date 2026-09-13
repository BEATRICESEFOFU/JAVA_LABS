/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int[] scores = new int[5];

        // Prompt the user to enter names and scores for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
        }

        try (FileWriter writer = new FileWriter("results.txt")) {
            for (int i = 0; i < 5; i++) {
                writer.write(names[i] + "," + scores[i] + System.lineSeparator());
            }

            // Inform the user that the results have been written to the file
            System.out.println("Results written to results.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to results.txt: " + e.getMessage());
        }

        scanner.close();
    }
}
    

