package Day8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class imageanimation extends JFrame implements ActionListener {

    private AnimationPanel animPanel;
    private JButton startBtn, stopBtn;

    public imageanimation() {
        setTitle("Image Animation");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        animPanel = new AnimationPanel();
        add(animPanel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.YELLOW);
        startBtn = new JButton("Start Animation");
        stopBtn  = new JButton("Stop Animation");
        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);
        btnPanel.add(startBtn);
        btnPanel.add(stopBtn);
        add(btnPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            animPanel.startAnimation();
        } else {
            animPanel.stopAnimation();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(imageanimation::new);
    }
}

class AnimationPanel extends JPanel {

    // Square path corners (top-left, top-right, bottom-right, bottom-left)
    private final int[][] corners = {
            {400, 50},  // top-right
            {400, 300}, // bottom-right
            {50, 300},  // bottom-left
            {50, 50}    // top-left
    };

    private int imgX = 400, imgY = 50;
    private int targetCorner = 1; // next corner index
    private int stepSize = 3;

    private final String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    private int msgIndex = 0;
    private String currentMessage = messages[0];

    private boolean running = false;
    private Thread moveThread, msgThread;

    // Placeholder image (colored rectangle since we can't load external files)
    private final int IMG_W = 80, IMG_H = 80;

    public AnimationPanel() {
        setBackground(Color.YELLOW);
        setPreferredSize(new Dimension(580, 380));
    }

    public void startAnimation() {
        if (running) return;
        running = true;

        // Image movement thread
        moveThread = new Thread(() -> {
            while (running) {
                int tx = corners[targetCorner][0];
                int ty = corners[targetCorner][1];

                int dx = Integer.compare(tx, imgX);
                int dy = Integer.compare(ty, imgY);

                imgX += dx * stepSize;
                imgY += dy * stepSize;

                // Snap to corner if close enough
                if (Math.abs(imgX - tx) <= stepSize) imgX = tx;
                if (Math.abs(imgY - ty) <= stepSize) imgY = ty;

                if (imgX == tx && imgY == ty) {
                    targetCorner = (targetCorner + 1) % 4;
                }

                SwingUtilities.invokeLater(this::repaint);
                try { Thread.sleep(10); } catch (InterruptedException ex) { break; }
            }
        });

        // Message cycling thread
        msgThread = new Thread(() -> {
            while (running) {
                try { Thread.sleep(1000); } catch (InterruptedException ex) { break; }
                msgIndex = (msgIndex + 1) % messages.length;
                currentMessage = messages[msgIndex];
                SwingUtilities.invokeLater(this::repaint);
            }
        });

        moveThread.setDaemon(true);
        msgThread.setDaemon(true);
        moveThread.start();
        msgThread.start();
    }

    public void stopAnimation() {
        running = false;
        if (moveThread != null) moveThread.interrupt();
        if (msgThread  != null) msgThread.interrupt();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw image placeholder (red/white face-like box)
        g.setColor(new Color(255, 200, 180));
        g.fillRect(imgX, imgY, IMG_W, IMG_H);
        g.setColor(Color.RED);
        g.drawRect(imgX, imgY, IMG_W, IMG_H);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.BOLD, 10));
        g.drawString("IMAGE", imgX + 20, imgY + 45);

        // Draw message in center
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 22));
        FontMetrics fm = g.getFontMetrics();
        int msgW = fm.stringWidth(currentMessage);
        g.drawString(currentMessage, (getWidth() - msgW) / 2, getHeight() / 2 + 20);
    }
}