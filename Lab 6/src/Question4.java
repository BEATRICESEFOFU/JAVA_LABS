/*
*Godiraone
*18001321
*Lab 6
 */

public class Question4 {

    // Adds two integers
    public static int combine(int a, int b) {
        return a + b;
    }

    // Joins two strings
    public static String combine(String a, String b) {
        return a + b;
    }

    // Adds two doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Java chooses the correct method automatically
        System.out.println(combine(5, 3));
        System.out.println(combine("Hello ", "World"));
        System.out.println(combine(2.5, 4.3));
    }
}