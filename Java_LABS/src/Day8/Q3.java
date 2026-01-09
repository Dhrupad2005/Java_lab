package Day8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame implements ActionListener {

    private JLabel titleLabel, timeLabel;
    private JButton startButton, resetButton;

    private int hours = 0, minutes = 0, seconds = 0, millis = 0;
    private boolean running = false;
    private Thread timerThread;

    public Q3() {
        setTitle("Stop Watch");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));
        getContentPane().setBackground(Color.LIGHT_GRAY);

        // Title
        titleLabel = new JLabel("Stop Watch");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.BLUE);

        // Time display
        timeLabel = new JLabel("00 : 00 : 00 . 00");
        timeLabel.setFont(new Font("Monospaced", Font.PLAIN, 18));

        // Buttons
        startButton = new JButton("Start");
        resetButton = new JButton("Reset");

        startButton.setPreferredSize(new Dimension(100, 30));
        resetButton.setPreferredSize(new Dimension(100, 30));

        startButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(titleLabel);
        add(timeLabel);
        add(startButton);
        add(resetButton);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) {
                running = true;
                startButton.setText("Stop");
                timerThread = new Thread(() -> {
                    while (running) {
                        try {
                            Thread.sleep(10); // 10ms = 1 centisecond
                        } catch (InterruptedException ex) {
                            break;
                        }
                        millis++;
                        if (millis == 100) { millis = 0; seconds++; }
                        if (seconds == 60) { seconds = 0; minutes++; }
                        if (minutes == 60) { minutes = 0; hours++; }

                        SwingUtilities.invokeLater(() -> timeLabel.setText(
                                String.format("%02d : %02d : %02d . %02d", hours, minutes, seconds, millis)
                        ));
                    }
                });
                timerThread.start();
            } else {
                running = false;
                startButton.setText("Start");
            }
        } else if (e.getSource() == resetButton) {
            running = false;
            startButton.setText("Start");
            hours = 0; minutes = 0; seconds = 0; millis = 0;
            timeLabel.setText("00 : 00 : 00 . 00");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q3::new);
    }
}