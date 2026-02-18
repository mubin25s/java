// Interface for different payment types
interface Payment {
    void pay(double amount);
}

// Concrete payment types
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}

class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bank Transfer Payment of $" + amount);
    }
}

// Factory to create payment objects
class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "banktransfer":
                return new BankTransferPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}

// Client using the factory
public class MarketplaceClient {
    public static void main(String[] args) {
        try {
            // User selects different payment methods
            Payment payment1 = PaymentFactory.createPayment("CreditCard");
            payment1.pay(150.00);

            Payment payment2 = PaymentFactory.createPayment("PayPal");
            payment2.pay(50.50);

            Payment payment3 = PaymentFactory.createPayment("BankTransfer");
            payment3.pay(1000.00);

            // Test unknown payment type
            // Payment payment4 = PaymentFactory.createPayment("Bitcoin");
            // payment4.pay(10.00);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
