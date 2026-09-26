/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question7 {

    //Writes a program that adds two lines to the end of output.txt from Question 2, without erasing the lines already in its
    public static void main(String[] args) {
        String fileName = "output.txt";

        // The 'true' flag tells FileWriter to append instead of overwriting
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("This is an appended sixth line.");
            writer.println("This is an appended seventh line.");

            System.out.println("Successfully appended two lines to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}