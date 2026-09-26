/*
Godiraone Sefofu
18001321
Lab7
 */

   import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Writing a program that writes fives of my choice to a new file called output.txt using a PrintWriter
public class Question2 {

    public static void main(String[] args) {
        String fileName = "output.txt";
        
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Welcome to Biust.");
            writer.println("Hope you enjoy coding.");
            writer.println("It was a chaotic week.");
            writer.println("Looking forward to a great weekend.");
            writer.println("Thank you, bye.");

            System.out.println("Successfully wrote five lines to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file: " + e.getMessage());
        }
    }
}