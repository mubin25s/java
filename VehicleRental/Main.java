package VehicleRental;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("XYZ-123", 50.0, 4);
        int days = 5;
        double cost = car.calculateRentalCost(days);
        System.out.println("Rental cost for " + days + " days: $" + cost);
    }
}
