/*
Godiraone Sefofu
18001321
Lab7
 */

//
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Writing a program that reads story.txt from Question 1 and prints how many lines it contains
public class Question4 {

    public static void main(String[] args) {
        String fileName = "story.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println(fileName + " contains " + lineCount + " lines.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}