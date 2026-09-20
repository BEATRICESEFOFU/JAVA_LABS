/*
*Godiraone Sefofu
*18001321
*lab5
 */

//Creates an array of the three Book objects and prints every book's summary
public class Question6 {
    public static void main(String[] args) {
    Book[] books = new Book[3];
    books[0] = new Book("First Sight", "Danielle Steel", 120.50);
    books[1] = new Book("Bloodline", "Sidney Sheldon", 95.00);
    books[2] = new Book("What Happened To You", "Oprah Winfrey", 153.00);

    for (int i = 0; i < books.length; i++) {
        System.out.println(books[i].getSummary());
    }
}
}
