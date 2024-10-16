package model;

public class BookModel {
    private String BookId;
    private String BookName;
    private String Category;
    private String Author;
    private String Quantity;

    public BookModel(String BookId, String BookName, String Category, String Author, String Quantity) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.Category = Category;
        this.Author = Author;
        this.Quantity = Quantity;
    }
    public String getBookId() {
        return BookId;
    }
    public void setBookId(String BookId) {
        this.BookId = BookId;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String Category) {
        this.Category = Category;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String getQuantity() {
        return Quantity;
    }
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public void setView() {
        System.out.println("ID: " + this.BookId);
        System.out.println(this.BookName);
        System.out.println("Category: " + this.Category);
        System.out.println("Author: " + this.Author);
        System.out.println("Quantity: " + this.Quantity);
    }
    //////
}
