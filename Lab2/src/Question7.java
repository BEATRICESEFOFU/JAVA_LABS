/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        long sum = 0;
        int count = 0;

        // Check if the file exists
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
                sum += number;
                count++;
            }

            // Check if the file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
            return;
        }

        if (count == 0) {
            System.out.println("numbers.txt contained no numbers.");
            return;
        }

        // Calculate the average of the numbers
        double average = (double) sum / count;

        // Write the smallest, largest, and average to stats.txt
        try (FileWriter writer = new FileWriter("stats.txt")) {
            writer.write("Smallest: " + smallest + System.lineSeparator());
            writer.write("Largest: " + largest + System.lineSeparator());
            writer.write("Average: " + average + System.lineSeparator());

            // Inform the user that the statistics have been written to the file
            System.out.println("Statistics written to stats.txt successfully.");
        } 
        catch (IOException e) {
            System.out.println("Error writing to stats.txt: " + e.getMessage());
        }
    }
}
    

