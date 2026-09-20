/*
*Godiraone Sefofu
*18001321
*lab5
 */

public class Book {

    //Q5: fields are private
    private String title;
    private String author;
    private double price;

    //Q2: constructor uses "this" to distinguish fields from parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    //Q4: returns a Single String combining the three fileds
    public String getSummary() {
        return title + " by " + author + " - P" + price;
    }

    //Q5: getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //Q5: setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}