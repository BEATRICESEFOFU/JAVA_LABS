/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Check if the file exists
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Check if the file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
            return;
        }

        // Write the counts of even and odd numbers to evenodd.txt
        try (FileWriter writer = new FileWriter("evenodd.txt")) {
            writer.write("Even numbers: " + evenCount + System.lineSeparator());
            writer.write("Odd numbers: " + oddCount + System.lineSeparator());

            // Inform the user that the counts have been written to the file
            System.out.println("Counts written to evenodd.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to evenodd.txt: " + e.getMessage());
        }
    }
}