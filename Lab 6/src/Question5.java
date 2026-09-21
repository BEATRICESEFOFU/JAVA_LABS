/*
*Godiraone
*18001321
*Lab 6
 */

public class Question5 {

    // Method that takes only a name
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method that takes a name and an age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Calling the first version of displayInfo
        displayInfo("Godiraone");

        // Calling the overloaded version
        displayInfo("Godiraone", 21);
    }
}