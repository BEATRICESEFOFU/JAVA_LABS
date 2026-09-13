/*
*Godiraone Sefofu
*18001321
*Lab 1
*/

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        // Find the space separating first name and surname
        int spaceIndex = fullName.indexOf(' ');

        String firstName = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        // Get the first letter of each part, in upper case
        char firstInitial = Character.toUpperCase(firstName.charAt(0));
        char surnameInitial = Character.toUpperCase(surname.charAt(0));

        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + firstInitial + "." + surnameInitial + ".");

        sc.close();
    }
}
    
