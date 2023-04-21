import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    public GUI() {
        frame =  new JFrame();

        JButton button = new JButton("click");
        button.addActionListener(this);

        label = new JLabel("number of click: 0");

        panel = new JPanel();

        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
    public static void main (String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of clicks: " + count);
    }
}
