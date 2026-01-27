/**
 * Level 2: Intermediate (Encapsulation & Constructors)
 */

// Topic: Encapsulation
// 1. BankAccount class with private attributes and public methods.
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

// 2. Grade class with private marks for three subjects.
class Grade {
    private int math, science, english;

    public void inputMarks(int m, int s, int e) {
        this.math = m;
        this.science = s;
        this.english = e;
    }

    public double calculateAverage() {
        return (math + science + english) / 3.0;
    }

    public String determineGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}

// Topic: Constructors
// 3. Employee class with attributes name, id, salary and both default and parameterized constructors.
class Employee {
    String name;
    int id;
    double salary;

    // Default Constructor
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// 4. Product class with productId, productName, and price initialized using a constructor.
class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);
    }
}

public class Level2Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 2: BankAccount ---");
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(400);
        System.out.println("Current Balance: " + account.checkBalance());

        System.out.println("\n--- Level 2: Grade ---");
        Grade g = new Grade();
        g.inputMarks(85, 90, 78);
        System.out.println("Average: " + g.calculateAverage());
        System.out.println("Grade: " + g.determineGrade());

        System.out.println("\n--- Level 2: Employee ---");
        Employee emp1 = new Employee(); // Default
        Employee emp2 = new Employee("John", 101, 50000); // Parameterized
        emp1.display();
        emp2.display();

        System.out.println("\n--- Level 2: Product ---");
        Product p = new Product(501, "Laptop", 75000);
        p.display();
    }
}
