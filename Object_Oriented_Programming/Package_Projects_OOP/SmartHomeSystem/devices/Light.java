package devices;

public class Light extends Device {
    private int brightness;

    public Light(String deviceId, String name) {
        super(deviceId, name);
        this.brightness = 0;
    }

    @Override
    public void performFunction() {
        if (isOn) {
            System.out.println("Light is shining at " + brightness + "% brightness.");
        } else {
            System.out.println("Light is currently OFF. Turn it on to adjust brightness.");
        }
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
            System.out.println(getName() + " brightness set to " + level + "%.");
        } else {
            System.out.println("Invalid brightness level.");
        }
    }
}
