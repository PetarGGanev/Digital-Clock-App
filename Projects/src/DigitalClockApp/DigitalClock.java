package DigitalClockApp;

import javax.swing.*;
import java.awt.*;

public class DigitalClock {

    private ClockDisplay clockDisplay;

    public DigitalClock() {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        clockDisplay = new ClockDisplay();

        frame.add(clockDisplay);

        frame.setVisible(true);
    }

    public void start() {
        Thread clockThread = new Thread(new ClockThread(clockDisplay));
        clockThread.start();
    }
}
