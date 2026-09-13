/*
*Godiraone Sefofu
*18001321
*Lab 4
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question3 {
    public static void main(String[] args) {
        
        // An integer array of my choice
        int[] numbers = {23, 5, 67, 12, 89, 3, 45, 78, 1, 34};

        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        String outputFileName = "stats.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            writer.println("Sum: " + sum);
            writer.println("Smallest:" + smallest);
            writer.println("Largest:" + largest);
            System.out.println("Results written to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
     }
 }
