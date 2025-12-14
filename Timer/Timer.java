package Timer;

public class Timer {
    private int seconds;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public void countdown() {
        while (seconds > 0) {
            System.out.println(seconds + " seconds remaining");
            seconds--;
        }
        System.out.println("Time's up!");
    }
}
