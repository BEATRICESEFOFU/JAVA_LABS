/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Writing a program that reads and prints every line of the file to the console
public class Question1 {

    public static void main(String[] args) {
        String fileName = "story.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}