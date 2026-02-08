

/**
 * BASICS: Constructors
 * A special method used to initialize objects.
 */
class Book {
    String title;
    String author;

    // Default Constructor
    Book() {
        System.out.println("A new book object is being created...");
    }

    // Parameterized Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class ConstructorConcept {
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.title = "Unknown";
        b1.author = "Unknown";

        // Using parameterized constructor
        Book b2 = new Book("Atomic Habits", "James Clear");

        b1.displayDetails();
        b2.displayDetails();
    }
}
