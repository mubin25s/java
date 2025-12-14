package Payroll;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("E001", "John Doe", 25.50);
        PayrollProcessor processor = new PayrollProcessor();
        processor.printPaySlip(emp, 40);
    }
}
