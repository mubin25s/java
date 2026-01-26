package VehicleRental;

public class Vehicle {
    private String licensePlate;
    private double dailyRate;

    public Vehicle(String licensePlate, double dailyRate) {
        this.licensePlate = licensePlate;
        this.dailyRate = dailyRate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }
}
