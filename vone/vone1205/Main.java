import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create JFrame
                JFrame frame = new JFrame("JSlider Example");
                frame.setSize(500, 250);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setLayout(new BorderLayout());

                // Create JLabel
                JLabel label = new JLabel("Current Value: 50", JLabel.CENTER);
                label.setFont(new Font("Arial", Font.BOLD, 18));

                // Create JSlider
                final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
                slider.setMajorTickSpacing(10);
                slider.setMinorTickSpacing(5);
                slider.setPaintTicks(true);
                slider.setPaintLabels(true);

                // Add ChangeListener
                slider.addChangeListener(new javax.swing.event.ChangeListener() {
                    @Override
                    public void stateChanged(javax.swing.event.ChangeEvent e) {
                        label.setText("Current Value: " + slider.getValue());
                    }
                });

                // Add components to frame
                frame.add(slider, BorderLayout.CENTER);
                frame.add(label, BorderLayout.SOUTH);

                // Show frame
                frame.setVisible(true);
            }
        });
    }
}