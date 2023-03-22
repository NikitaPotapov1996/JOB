package Library;

public class Book {
    String author, type;

    public Book(String author, String type) {
        this.author = author;
        this.type = type;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
