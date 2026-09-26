/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Writing a program that reads story.txt and prints how many words it contains in total
public class Question5 {

    public static void main(String[] args) {
        String fileName = "story.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println(fileName + " contains " + wordCount + " words.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}