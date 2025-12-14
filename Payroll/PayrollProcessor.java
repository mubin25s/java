package Payroll;

public class PayrollProcessor {
    public void printPaySlip(Employee emp, double hours) {
        double pay = emp.calculatePay(hours);
        System.out.println("Payslip for: " + emp.getName());
        System.out.println("Hours Worked: " + hours);
        System.out.println("Total Pay: $" + pay);
    }
}
