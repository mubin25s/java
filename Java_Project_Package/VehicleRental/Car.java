package VehicleRental;

public class Car extends Vehicle {
    private int doors;

    public Car(String licensePlate, double dailyRate, int doors) {
        super(licensePlate, dailyRate);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
