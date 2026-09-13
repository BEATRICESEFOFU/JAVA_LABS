/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // 9.0/5 avoids integer-division truncation
        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.println(celsius + " degrees Celsius is " + fahrenheit
                + " degrees Fahrenheit.");

        sc.close();
    }
}
    

