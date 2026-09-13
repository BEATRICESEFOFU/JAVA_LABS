/*Godiraone Sefofu
 * 18001321
 * Lab 2
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        // Read numbers from the file and check if the target number exists
        File inputFile = new File("numbers.txt");
        boolean found = false;

        // Check if the file exists
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                if (number == target) {
                    found = true;
                    break;
                }
            }

            // Check if the file is empty
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
            scanner.close();
            return;
        }

        // Inform the user whether the target number was found

        System.out.println(found);

        scanner.close();
    }
}