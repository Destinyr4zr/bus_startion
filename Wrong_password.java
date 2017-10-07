import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wrong_password {
    public void show_window(Point location) {


    JFrame wrongFrame = new JFrame("Wrong password");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("You have entered wrong password");
    JButton back = new JButton("Back");
    BoxLayout layout = new BoxLayout(panel,BoxLayout.Y_AXIS);
    panel.setLayout(layout);
    panel.add(label);
    panel.add(back);
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            wrongFrame.setVisible(false);
            wrongFrame.dispose();
        }
    });
    wrongFrame.setContentPane(panel);
    wrongFrame.setVisible(true);
    wrongFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    wrongFrame.setSize(300, 150);
    wrongFrame.setLocation(location.x , location.y + 75);
    }
}
