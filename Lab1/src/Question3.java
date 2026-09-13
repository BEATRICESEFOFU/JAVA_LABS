/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name and age
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age ");
        int age = sc.nextInt();
    
        // Printing a message that includes the user's name and their age in five years
        System.out.println("Hello " + name + "! In five years, you will be " + (age + 5) + " years old.");

        sc.close();
    }
    
}
