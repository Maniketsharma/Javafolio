import java.util.ArrayList;
import java.util.List;

public class o5{
    // Attributes
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public o5(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Methods to add and remove books from a collection
    public static void addBook(List<o5> collection, o5 book) {
        collection.add(book);
        System.out.println("Book added to the collection: " + book.getTitle());
    }

    public static void removeBook(List<o5> collection, o5 book) {
        if (collection.remove(book)) {
            System.out.println("Book removed from the collection: " + book.getTitle());
        } else {
            System.out.println("Book not found in the collection: " + book.getTitle());
        }
    }

    public static void main(String[] args) {
        // Create a collection to hold books
        List<o5> bookCollection = new ArrayList<o5>();

        // Create instances of the Book class
        o5 book1 = new o5("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        o5 book2 = new o5("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Add books to the collection
        addBook(bookCollection, book1);
        addBook(bookCollection, book2);

        // Remove a book from the collection
        o5 bookToRemove = new o5("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        removeBook(bookCollection, bookToRemove);
    }
}
