/**
 * Level 3: Object Relationships (Inheritance, Polymorphism, Abstraction)
 */

// Topic: Inheritance
// 1. Single inheritance: Vehicle and Car
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition...");
    }
}

// 2. Multilevel inheritance: Person -> Employee -> Manager
class Person {
    String name = "Mubin";
}

class EmployeeLevel3 extends Person {
    int empId = 101;
}

class Manager extends EmployeeLevel3 {
    String department = "Engineering";

    void displayInfo() {
        System.out.println("Manager: " + name + ", ID: " + empId + ", Dept: " + department);
    }
}

// 3. Hierarchical inheritance: Shape -> Circle, Triangle
class ShapeLevel3 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class CircleLevel3 extends ShapeLevel3 {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class TriangleLevel3 extends ShapeLevel3 {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Topic: Method Overloading & Overriding
// 1. Method Overloading in AreaCalculator
class AreaCalculator {
    // Circle area
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    double area(double length, double width) {
        return length * width;
    }
}

// 2. Method Overriding in Animal, Dog, Cat
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Topic: Abstraction
// 1. Abstract class Payment and subclasses
abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// 2. Abstract class Shape and implementation
abstract class AbstractShape {
    abstract double area();
}

class ConcreteRectangle extends AbstractShape {
    double l, w;
    ConcreteRectangle(double l, double w) { this.l = l; this.w = w; }
    @Override
    double area() { return l * w; }
}

class ConcreteCircle extends AbstractShape {
    double r;
    ConcreteCircle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}

public class Level3Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 3: Inheritance ---");
        Manager mgr = new Manager();
        mgr.displayInfo();

        System.out.println("\n--- Level 3: Overloading ---");
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Circle Area (r=5): " + ac.area(5));
        System.out.println("Rect Area (10x5): " + ac.area(10, 5));

        System.out.println("\n--- Level 3: Overriding ---");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();

        System.out.println("\n--- Level 3: Abstraction ---");
        Payment p1 = new CreditCardPayment();
        p1.processPayment(150.0);
        
        AbstractShape s1 = new ConcreteCircle(7);
        System.out.println("Concrete Circle Area: " + s1.area());
    }
}
