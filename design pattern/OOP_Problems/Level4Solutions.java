import java.io.*;
import java.util.*;

/**
 * Level 4: Advanced (Interfaces, Composition, Access Modifiers, Exception Handling)
 */

// Topic: Interface
interface Drivable {
    void start();
    void stop();
}

class CarLevel4 implements Drivable {
    public void start() { System.out.println("Car started"); }
    public void stop() { System.out.println("Car stopped"); }
}

class BikeLevel4 implements Drivable {
    public void start() { System.out.println("Bike started"); }
    public void stop() { System.out.println("Bike stopped"); }
}

interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck is flying"); }
    public void swim() { System.out.println("Duck is swimming"); }
}

// Topic: Composition (Has-A Relationship)
class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class Department {
    String deptName;
    List<Professor> professors;
    Department(String deptName) {
        this.deptName = deptName;
        this.professors = new ArrayList<>();
    }
    void addProfessor(Professor p) { professors.add(p); }
}

class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    List<Book> books = new ArrayList<>();
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        for (Book b : books) System.out.println("Book: " + b.title);
    }
}

// Topic: Access Modifiers
class StudentLevel4 {
    private String name;
    private int id;
    private double cgpa;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    public double getCgpa() { return cgpa; }
}

// Topic: Exception Handling
class ExceptionDemo {
    void handleArithmetic() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    void handleIO() {
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"))) {
            br.readLine();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    void handleNumberFormat(String s) {
        try {
            int val = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}

class MarksValidator {
    void validate(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100. Provided: " + marks);
        }
        System.out.println("Marks are valid: " + marks);
    }
}

public class Level4Solutions {
    public static String readFirstLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Level 4: Interfaces ---");
        Duck d = new Duck();
        d.fly();
        d.swim();

        System.out.println("\n--- Level 4: Composition ---");
        Library lib = new Library();
        lib.addBook(new Book("Java Programming"));
        lib.addBook(new Book("Design Patterns"));
        lib.showBooks();

        System.out.println("\n--- Level 4: Exception Handling ---");
        ExceptionDemo demo = new ExceptionDemo();
        demo.handleArithmetic();
        demo.handleNumberFormat("abc");

        System.out.println("\n--- Level 4: Throw ---");
        MarksValidator mv = new MarksValidator();
        try {
            mv.validate(150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Level 4: Throws ---");
        try {
            readFirstLine("test.txt");
        } catch (IOException e) {
            System.out.println("Handled throws from main: " + e.getMessage());
        }
    }
}
