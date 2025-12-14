package TrafficLight;

public class TrafficLight {
    private String color;

    public TrafficLight() {
        this.color = "Red";
    }

    public void changeColor() {
        if (color.equals("Red")) {
            color = "Green";
        } else if (color.equals("Green")) {
            color = "Yellow";
        } else {
            color = "Red";
        }
        System.out.println("Traffic Light is now: " + color);
    }
}
