/**
 * Level 1: Beginner (Core OOP Building Blocks)
 * Topic: Classes and Objects
 */

// 1. Student class with attributes: name, id, and cgpa.
class Student {
    String name;
    int id;
    double cgpa;

    // Method to display student information
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
}

// 2. Calculator class with methods for addition, subtraction, multiplication, and division.
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (double) a / b;
    }
}

// 3. Rectangle class with length and width as attributes.
class Rectangle {
    double length;
    double width;

    // Method to calculate and return the area
    double calculateArea() {
        return length * width;
    }
}

public class Level1Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 1: Student ---");
        Student s1 = new Student();
        s1.name = "Mubin";
        s1.id = 25;
        s1.cgpa = 3.9;
        s1.display();

        System.out.println("\n--- Level 1: Calculator ---");
        Calculator calc = new Calculator();
        System.out.println("Addition (10+5): " + calc.add(10, 5));
        System.out.println("Subtraction (10-5): " + calc.subtract(10, 5));
        System.out.println("Multiplication (10*5): " + calc.multiply(10, 5));
        System.out.println("Division (10/5): " + calc.divide(10, 5));

        System.out.println("\n--- Level 1: Rectangle ---");
        Rectangle rect = new Rectangle();
        rect.length = 10.5;
        rect.width = 5.2;
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
