import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Driver {
    public void show_window (ArrayList<Person> persons, int id, boolean role)
    {
        JFrame driverFrame = new JFrame("Your timetable");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Hello, "+ persons.get(id).name);
        panel.add(label1);
        JLabel labels[] = new JLabel[ persons.get(id).routs.size()];
        for (int i = 0; i <  persons.get(id).routs.size(); i++) {
            labels[i] = new JLabel("Маршрут " + i +" "+ persons.get(id).routs.get(i).start_city + " (" + persons.get(id).routs.get(i).start_time + ") -" + persons.get(id).routs.get(i).end_city + " (" + persons.get(id).routs.get(i).end_time + ")");
            panel.add(labels[i]);
        }
        JButton back = new JButton("Back");
        BoxLayout layout = new BoxLayout(panel,BoxLayout.PAGE_AXIS);
        panel.setLayout(layout);
        panel.add(back);
        System.out.println(persons.get(id).role + " " + persons.get(id).name);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driverFrame.setVisible(false);
                driverFrame.dispose();
            }
        });
                driverFrame.setContentPane(panel);
        driverFrame.setVisible(true);
        driverFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        driverFrame.setSize(300, 150);
    }
}
