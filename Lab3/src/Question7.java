/*Godiraone Sefofu
*18001321
*Lab 3
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        //
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
    

