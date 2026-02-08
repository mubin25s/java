package devices;

public abstract class Device {
    private String deviceId;
    private String name;
    protected boolean isOn;

    public Device(String deviceId, String name) {
        this.deviceId = deviceId;
        this.name = name;
        this.isOn = false;
    }

    public abstract void performFunction();

    public void turnOn() {
        isOn = true;
        System.out.println(name + " (ID: " + deviceId + ") is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " (ID: " + deviceId + ") is now OFF.");
    }

    public String getName() {
        return name;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean getStatus() {
        return isOn;
    }
}
