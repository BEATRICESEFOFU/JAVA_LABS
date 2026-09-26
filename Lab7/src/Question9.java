/*
Godiraone Sefofu
18001321
Lab7
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question9 {

    //Writing a program that asks the user, in a loop, for three students' names and scores, then writes each as a "Name,Score" line in a file called results.txt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "results.txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            //Loop exactly 3 times, once per student
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name for student " + i + ": ");
                String name = scanner.nextLine().trim();

                System.out.print("Enter score for student " + i + ": ");
                //Read the score as text first, then convert it to an int
                int score = Integer.parseInt(scanner.nextLine().trim());

                //Write this student's details as a single comma-separated line
                writer.println(name + "," + score);
            }

            System.out.println("Successfully wrote 3 name-score pairs to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file: " + e.getMessage());
        }

        //Always close the Scanner once we're done reading user input
        scanner.close();
    }
}