 /*
*Godiraone Sefofu
*18001321
*lab5
 */

//Creates two Book objects and prints each one's title, author, and price
public class Question3 {
    public static void main (String[] args) {
    Book book1 = new Book("First Things", "Danielle Steel", 120.50);
    Book book2 = new Book("Boodline", "Sydney Sheldon", 95.00);

    System.out.println("Book 1:");
    System.out.println("Title: " + book1.getTitle());
    System.out.println("Author: " + book1.getAuthor());
    System.out.println("Price: P" + book1.getPrice());

    System.out.println();

    System.out.println("Book 2:");
    System.out.println("Title:" + book2.getTitle());
    System.out.println("Author: " + book2.getAuthor());
    System.out.println("Price: P" + book2.getPrice());
}
    
}
