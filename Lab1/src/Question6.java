/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scanner can read multiple space-separated values from one line
        System.out.print("Enter three scores: ");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("Average: " + average);

        sc.close();
    }   
}
