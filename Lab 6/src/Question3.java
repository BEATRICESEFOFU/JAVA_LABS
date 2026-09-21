/*
*Godiraone
*18001321
*Lab 6
 */

public class Question3 {

    // Void method prints the banner directly
    public static void printBanner() {
        System.out.println("********************");
    }

    // Method returns the banner as a String
    public static String getBanner() {
        return "********************";
    }

    public static void main(String[] args) {

        // Calling the void method
        printBanner();

        // Calling the returning method
        String banner = getBanner();
        System.out.println(banner);
    }
}