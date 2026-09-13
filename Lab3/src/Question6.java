/*Godiraone Sefofu
*18001321
*Lab 3
 */
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        // 
        do {
            System.out.print("Enter a number (0 to stop):");
            number = scanner.nextInt();
            total += number;

        } while (number != 0);

        System.out.println("Final total: " + total);

        scanner.close();
        }
    }


