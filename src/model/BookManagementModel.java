package model;

import java.io.*;
import java.util.ArrayList;

public class BookManagementModel {
    private ArrayList<BookModel> books;

    public BookManagementModel() {
        this.books = new ArrayList<>();
    }

    // Đọc dữ liệu từ file .txt và lưu vào danh sách books
    public void loadBooksFromFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] bookData = line.split(",");
                if (bookData.length == 5) {
                    String bookId = bookData[0];
                    String bookName = bookData[1];
                    String category = bookData[2];
                    String author = bookData[3];
                    String quantity = bookData[4];
                    BookModel book = new BookModel(bookId, bookName, category, author, quantity);
                    books.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public ArrayList<BookModel> getBooks() {
        return books;
    }


}

