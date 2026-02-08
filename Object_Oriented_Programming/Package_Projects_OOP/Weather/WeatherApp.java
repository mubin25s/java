import operations.WeatherStation;
import models.WeatherRecord;

public class WeatherApp {
    public static void main(String[] args) {
        System.out.println("========== Advanced Weather Monitoring System ==========");
        
        // Setup Station
        WeatherStation cityStation = new WeatherStation("WS-NYC-01", "New York City");
        cityStation.displayStationDetails();

        // Simulate multiple readings
        System.out.println("\nGathering real-time sensor data...");
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nReading #" + i + ":");
            WeatherRecord current = cityStation.computeCurrentWeather();
            current.display();
            
            // Basic logic check
            if (current.getTemperature() > 30) {
                System.out.println("ALERT: High Temperature Warning!");
            } else if (current.getTemperature() < 0) {
                System.out.println("ALERT: Frost Warning!");
            }
            
            try {
                Thread.sleep(500); // Small delay for effect
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nMonitoring Status: SUCCESSFUL");
        System.out.println("======================================================");
    }
}
