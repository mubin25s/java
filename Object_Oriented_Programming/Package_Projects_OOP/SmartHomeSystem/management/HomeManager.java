package management;

import devices.Device;
import java.util.ArrayList;
import java.util.List;

public class HomeManager {
    private List<Device> devices;

    public HomeManager() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("System: Added " + device.getName() + " to the home network.");
    }

    public void turnAllOn() {
        System.out.println("\n--- Powering Up All Devices ---");
        for (Device d : devices) {
            d.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("\n--- Shutting Down All Devices ---");
        for (Device d : devices) {
            d.turnOff();
        }
    }

    public void showSystemStatus() {
        System.out.println("\n--- Current System Status ---");
        for (Device d : devices) {
            String status = d.getStatus() ? "ON" : "OFF";
            System.out.println("[" + d.getDeviceId() + "] " + d.getName() + ": " + status);
            d.performFunction();
        }
    }
}
