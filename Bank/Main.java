package Bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000, 0.05);
        System.out.println("Initial Balance: " + sa.getBalance());
        
        sa.deposit(500);
        System.out.println("After Deposit: " + sa.getBalance());
        
        sa.withdraw(200);
        System.out.println("After Withdrawal: " + sa.getBalance());
    }
}
