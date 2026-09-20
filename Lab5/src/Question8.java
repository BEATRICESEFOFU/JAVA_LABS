/*
*Godiraone Sefofu
*18001321
*lab5
 */ 
    
//cheaperBook(Book a, Book b) returns whichever Book that has a lower price
public class Question8 {

    public static Book cheaperBook(Book a, Book b) {
        if (a.getPrice() <= b.getPrice()) {
            return a;
        } else {
            return b;
        }
    }  
        public static void main(String[] args) {
            Book book1 = new Book("First Sight", "Danielle Steel", 120.50);
            Book book2 = new Book("Bloodline", "Sidney Sheldon", 95.00);

            Book cheaper = cheaperBook(book1, book2);
            System.out.println("The cheaper book is: " + cheaper.getSummary());
        }
    }

