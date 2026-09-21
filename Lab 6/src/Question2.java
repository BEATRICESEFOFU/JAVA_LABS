/*
*Godiraone
*18001321
*Lab 6
 */

public class Question2 {

    // Method that calculates and returns the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Call the method using two different radii
        System.out.println("Area = " + circleArea(3));
        System.out.println("Area = " + circleArea(5));
    }
}