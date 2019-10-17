package online_reader_system;

public class Book {

    private int bookId;
    private String details;

    public Book(int id, String details) {
        bookId = id;
        this.details = details;
    }

    public void uodates() {}

    public int getId() { return bookId; }
    public void setId(int id) { bookId = id; }

    public String getDetails() { return details; }

    public void setDetails(String details) {
        this.details = details;
    }
}
