import devices.Light;
import devices.Thermostat;
import management.HomeManager;

public class SmartHomeApp {
    public static void main(String[] args) {
        System.out.println("====== Smart Home Management System ======");

        HomeManager myHome = new HomeManager();

        // Creating devices
        Light livingRoomLight = new Light("L001", "Living Room Light");
        Thermostat mainAC = new Thermostat("T001", "Main Air Conditioner");
        Light kitchenLight = new Light("L002", "Kitchen Light");

        // Adding to manager
        myHome.addDevice(livingRoomLight);
        myHome.addDevice(mainAC);
        myHome.addDevice(kitchenLight);

        // Interact with devices
        myHome.turnAllOn();

        System.out.println("\n--- Individual Controls ---");
        livingRoomLight.setBrightness(75);
        mainAC.setTemperature(24.5);

        // Show status
        myHome.showSystemStatus();

        // Turn all off
        myHome.turnAllOff();
        
        System.out.println("\n==========================================");
    }
}
