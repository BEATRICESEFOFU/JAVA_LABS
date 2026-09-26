/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Question6 {

    //Writes a program that reads every line from story.txt and writes those same lines into a new file called story_copy.txt
    public static void main(String[] args) {
        String sourceFile = "story.txt";
        String destinationFile = "story_copy.txt";

        //Both resources are opened in the same try-with-resources statement, and both are automatically closed afterwards

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             PrintWriter writer = new PrintWriter(destinationFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Write each line read from the source straight into the destination
                writer.println(line);
            }

            System.out.println("Copied " + sourceFile + " to " + destinationFile + " successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}