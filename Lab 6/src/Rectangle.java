/*
*Godiraone
*18001321
*Lab 6
 */

import java.util.Scanner;

public class Rectangle {

    // Calculates area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Calculates perimeter of a rectangle
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read length from user
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        // Read width from user
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Display calculated area
        System.out.println("Area = " + area(length, width));

        // Display calculated perimeter
        System.out.println("Perimeter = " + perimeter(length, width));

        // Close scanner
        input.close();
    }
}