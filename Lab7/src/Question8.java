/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question8 {

//Writing a program that reads ten integers (one per line ) from numbers.txt and prints their total
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int total = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    total += Integer.parseInt(line);
                }
            }
            System.out.println("The total of the numbers in " + fileName + " is: " + total);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("The file contains a value that is not a valid integer: " + e.getMessage());
        }
    }
}