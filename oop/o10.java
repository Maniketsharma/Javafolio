import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class o10{
    private List<Book> books;

    // Constructor
    public o10() {
        this.books = new ArrayList<Book>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book);
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book);
        } else {
            System.out.println("Book not found in the library: " + book);
        }
    }

    // Method to display the list of books in the library
    public void displayBooks() {
        System.out.println("\nBooks in the Library:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Create a new library
        o10 library = new o10();

        // Add books to the library
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display the list of books in the library
        library.displayBooks();

        // Remove a book from the library
        library.removeBook(book2);

        // Display the updated list of books in the library
        library.displayBooks();
    }
}
