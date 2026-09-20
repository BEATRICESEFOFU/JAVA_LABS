/*
*Godiraone Sefofu
*18001321
*lab5
 */

//Creates a Library, adds four Book objects then prints the full collection
public class Question10 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("First Sight", "Danielle Steel", 120.50));
        library.addBook(new Book("Bloodline","Sidney Sheldon" , 95.00));
        library.addBook(new Book("What Happened To You", "Oprah Winfrey",153.00));
        library.addBook(new Book("Can We Get Married", "Nelly Page Magwaza", 200.00));
        library.printAllBooks();
    }
    
}
