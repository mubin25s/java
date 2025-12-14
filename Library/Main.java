package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("1984", "George Orwell");

        library.addBook(b1);
        library.addBook(b2);

        library.listBooks();
        b1.borrowBook();
        System.out.println("\nAfter borrowing " + b1.getTitle() + ":");
        library.listBooks();
    }
}
