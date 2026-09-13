/*
*Godiraone Sefofu
*18001321
*Lab 4
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Array with a capacity of 20 words
        String[] words = new String[20];
        int count = 0; 

        File file = new File("names.txt");

        try (Scanner fileScanner = new Scanner(file)) {
            // Read one word at a time until the end of the file or until the array is full
            while (fileScanner .hasNext() && count < words.length) {
                words[count] = fileScanner .next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the file names.txt");
            return;
        }

        // Display the words that were read in
        System.out.println("Words read from names.txt:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1)+ "." + words[i]);
        }
        if (count == 0) {
            System.out.println("No words were found in the file.");
        }
    }
}