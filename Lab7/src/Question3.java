/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Writing a program that tries to read missing.txt (a file that does not exist) and handles the resulting exception gracefully insteadof letting the program crash
public class Question3 {

    public static void main(String[] args) {
        String fileName = "missing.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file '" + fileName + "' could not be found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}