/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        File inputFile = new File("students.txt");

        // Check if the file exists
        try (Scanner fileScanner = new Scanner(inputFile);
             FileWriter writer = new FileWriter("grades.txt")) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());

                // Determine the letter grade based on the score
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

                // Write the name, score, and grade to the grades.txt file
                writer.write(name + "," + score + "," + grade + System.lineSeparator());
            }

            // Inform the user that the grades have been written to the file
            System.out.println("Grade report written to grades.txt successfully.");

            // Check if the input file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt was not found in this folder.");

            // Handle any other IO exceptions that may occur while writing to the grades.txt file
        } catch (IOException e) {
            System.out.println("Error writing to grades.txt: " + e.getMessage());
        }
    }
}