package Payroll;

public class Employee {
    private String id;
    private String name;
    private double hourlyRate;

    public Employee(String id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay(double hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }
}
