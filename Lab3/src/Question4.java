/*Godiraone Sefofu
*18001321
*Lab 3
 */
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Implement a do-while loop that continues until the user chooses to exit
        do {
            System.out.println("1.Continue");
            System.out.println("2. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Continuing...");
            } else if (choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);

        System.out.println("Goodbye!");

        scanner.close();
            }
        }
    

    

