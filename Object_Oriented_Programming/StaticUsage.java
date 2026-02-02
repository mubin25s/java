
/**
 * THE STATIC KEYWORD
 * Definition: The static keyword is used for memory management. 
 * It belongs to the class rather than the instance of the class.
 * 
 * 1. Static Variable: Shared by all objects of the class.
 * 2. Static Method: Can be called without creating an object.
 * 3. Static Block: Used to initialize static variables.
 */

class Student {
    String name; // Instance variable
    static String college = "University of Tech"; // Static variable (shared)

    Student(String name) {
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
        // name = "XYZ"; // COMPILE ERROR: Static methods cannot access instance variables
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticUsage {
    // Static block
    static {
        System.out.println("Static block executed: Class is loaded.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        // Changing static variable using class name
        Student.changeCollege("Innova University");

        System.out.println("\nAfter changing static variable:");
        s1.display(); // Reflects the change
        s2.display(); // Reflects the change
    }
}
