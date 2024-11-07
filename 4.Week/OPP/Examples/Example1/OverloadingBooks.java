package Examples;

public class OverloadingBooks {
    String title;
    String author;
    double Price;

    public OverloadingBooks() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.Price = -1.0;
    }
    public OverloadingBooks(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public OverloadingBooks(String title, String author, double Price) {
        this.title = title;
        this.author = author;
        this.Price = Price;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + Price;
    }
}
