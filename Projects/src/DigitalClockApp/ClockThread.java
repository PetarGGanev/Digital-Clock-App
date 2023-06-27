package DigitalClockApp;

public class ClockThread implements Runnable {

    private ClockDisplay clockDisplay;

    public ClockThread(ClockDisplay clockDisplay) {
        this.clockDisplay = clockDisplay;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            clockDisplay.updateTime();
            clockDisplay.updateDate();
            clockDisplay.updateTimeZone();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
