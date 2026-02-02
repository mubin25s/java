
/**
 * THIS AND SUPER KEYWORDS
 * 
 * 'this': Refers to the current object instance.
 * 'super': Refers to the immediate parent class object.
 * 
 * Common uses:
 * 1. this.field: Refer to current class field (shadowed by parameter).
 * 2. this(): Call another constructor in the same class.
 * 3. super.field/method: Access parent class member.
 * 4. super(): Call parent class constructor.
 */

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called for: " + name);
    }

    void greet() {
        System.out.println("Hello, I am a person.");
    }
}

class Employee extends Person {
    double salary;

    // Constructor Chaining
    Employee(String name) {
        this(name, 0.0); // Calls the other constructor of Employee
    }

    Employee(String name, double salary) {
        super(name); // Calls parent (Person) constructor
        this.salary = salary;
        System.out.println("Employee constructor called with salary: " + salary);
    }

    @Override
    void greet() {
        super.greet(); // Calls parent's greet()
        System.out.println("And I am also an employee with salary " + salary);
    }
}

public class ThisAndSuperDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        System.out.println();
        emp.greet();
    }
}
