/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");

        // Initialize totals and counts for positive and negative numbers
        long positiveTotal = 0;
        long negativeTotal = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        // Check if the file exists and read numbers from it
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                if (number > 0) {
                    positiveTotal += number;
                    positiveCount++;
                } else if (number < 0) {
                    negativeTotal += number;
                    negativeCount++;
                }
                // numbers equal to 0 are neither positive nor negative, so they are skipped
            }

            // Check if the file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
            return;
        }

        try (FileWriter writer = new FileWriter("signs.txt")) {
            writer.write("Positive total: " + positiveTotal + " (" + positiveCount + " numbers)" + System.lineSeparator());
            writer.write("Negative total: " + negativeTotal + " (" + negativeCount + " numbers)" + System.lineSeparator());

            // Inform the user that the totals have been written to the file
            System.out.println("Totals written to signs.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to signs.txt: " + e.getMessage());
        }
    }
}
    

