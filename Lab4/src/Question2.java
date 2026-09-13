/*
*Godiraone Sefofu
*18001321
*Lab 4
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question2 {
    public static void main(String[] args) {

        // A double array of my choice
        double [] numbers = {12.5, 8.75, 100.0, 3.14159, 45.2, 9.99};

        String outputFileName = "doubles.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            for (int i = 0; i < numbers.length; i++) {
                writer .println(numbers[i]);
            }

            // Uses a for loop to write every value in the array to a new file, one value per line
            System.out.println("Successfully wrote" + numbers.length + " values to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error: could not write to the file " + e.getMessage());
        }
    }
}


