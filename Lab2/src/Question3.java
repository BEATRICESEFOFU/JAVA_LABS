/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */
    
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        File file = new File("students.txt");

        // Check if the file exists
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String name = parts[0].trim();
                String score = parts[1].trim();

                // Display the name and score
                System.out.println("Name: " + name + " | Score: " + score);
            }

            // Check if the file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt was not found in this folder.");
        }
    }
}