/*
*Godiraone Sefofu
*18001321
*lab5
 */

import java.util.ArrayList;

//Library holds a collection of Book objects
public class Library {
    
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }
    
    public void addBook(Book b) {
        books.add(b);
    }

    public void printAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getSummary());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("First Sight", "Danielle Steel",120.50));
        library.addBook(new Book("Bloodline", "Sidney Sheldon", 95.00));

        library.printAllBooks();
    }
}
