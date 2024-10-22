package model;

public class BookModel {
    private String BookId;
    private String BookName;
    private String Category;
    private String Author;
    private String Publisher;
    private String Quantity;

    public BookModel(String BookId, String BookName, String Category, String Author, String Publisher, String Quantity) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.Category = Category;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Quantity = Quantity;
    }

    public String getBookId() { return BookId; }

    public void setBookId(String BookId) { this.BookId = BookId; }

    public String getBookName() { return BookName; }

    public void setBookName(String BookName) { this.BookName = BookName; }

    public String getCategory() { return Category; }

    public void setCategory(String Category) { this.Category = Category; }

    public String getAuthor() { return Author; }

    public void setAuthor(String Author) { this.Author = Author; }

    public String getPublisher() { return Publisher; }

    public void setPublisher(String publisher) { this.Publisher = publisher; }

    public String getQuantity() { return Quantity; }

    public void setQuantity(String Quantity) { this.Quantity = Quantity; }

    public static String searchIdBook(String BookName) {
        // Lay du lieu tu du lieu SACH
    }

    public static boolean checkIdBook(String BookId) {
        // Lay du lieu tu du lieu SACH
    }

    public static String generateNewBookCode() {
        // Phuong thuc lay ma so sach lon nhat, them tu dong ma so sach moi
    }

    public static boolean addBook(String BookId, String BookName, String Category, String Author, String Publisher, String Quantity) {
        // Them sach vao co so du lieu
    }

    public static boolean deleteBook(String BookId) {
        // Xoa sach trong co so du lieu
    }

    public static boolean updateBook(String BookId, String BookName, String Category, String Author, String Publisher, String Quantity) {
        // Cap nhat sach trong co so du lieu
    }
}
