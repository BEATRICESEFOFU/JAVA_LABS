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

public class Question10 {

    //Writing a program that reads the Name,Score lines from results.txt (Question 9) and writes only the students who scored 50 or above into a new file called passed.txt 
    public static void main(String[] args) {
        String inputFile = "results.txt";
        String outputFile = "passed.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue; //skip any blank lines
                }
   
                //Split "Name,Score" into its two parts around the comma
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());

                //Only students scoring 50 or above get written to passed.txt
                if (score >= 50) {
                    writer.println(name + "," + score);
                }
            }

            System.out.println("Passing students have been written to " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}