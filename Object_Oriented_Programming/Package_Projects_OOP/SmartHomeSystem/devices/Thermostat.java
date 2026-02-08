package devices;

public class Thermostat extends Device {
    private double temperature;

    public Thermostat(String deviceId, String name) {
        super(deviceId, name);
        this.temperature = 22.0; // Default temperature
    }

    @Override
    public void performFunction() {
        if (isOn) {
            System.out.println("Thermostat is maintaining temperature at " + temperature + "°C.");
        } else {
            System.out.println("Thermostat is OFF. Climate control inactive.");
        }
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(getName() + " target temperature updated to " + temp + "°C.");
    }
}
