package DigitalClockApp;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ClockDisplay extends JPanel {

    private JLabel timeLabel;
    private JLabel dateLabel;
    private JLabel timeZoneLabel;

    public ClockDisplay() {
        setLayout(new BorderLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 72));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);

        timeZoneLabel = new JLabel();
        timeZoneLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        timeZoneLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(timeLabel, BorderLayout.CENTER);
        add(dateLabel, BorderLayout.NORTH);
        add(timeZoneLabel, BorderLayout.SOUTH);
    }

    public void updateTime() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(sdf.format(now));
    }

    public void updateDate() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM dd, yyyy");
        dateLabel.setText(sdf.format(now));
    }

    public void updateTimeZone() {
        String timeZone = TimeZone.getDefault().getID();
        timeZoneLabel.setText("Time Zone: " + timeZone);
    }
}
