import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu{
    static ArrayList<Person> persons = new ArrayList<Person>();
    public static void main(String[] args){
        Menu m = new Menu();
        m.fill_information();
        m.show_window();
        System.out.println(persons.size());
    }
    public void fill_information(){
        Person bob = new Person("bob", "123", false );
        persons.add(bob);
        Person Mike = new Person("Mike","frog",true);
        persons.add(Mike);
        Rout rout = new Rout("Moscow","London","12:20","15:50");
        persons.get(0).routs.add(rout);

    }
    public void show_window(){
        JFrame menuFrame = new JFrame("Login");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        JLabel login_label = new JLabel("Enter your login");
        JLabel password_label = new JLabel("Enter your password");
        JTextField login_field = new JTextField();
        JPasswordField password_field = new JPasswordField();
        JButton sign_in = new JButton("Sign in");
        JButton exit = new JButton("exit");
        panel.add(login_label);
        panel.add(login_field);
        panel.add(password_label);
        panel.add(password_field);
        panel.add(sign_in);
        panel.add(exit);
        sign_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean found = false;
                for(int id = 0; id < persons.size();id++){
                    if(login_field.getText().equals(persons.get(id).name) && password_field.getText().equals(persons.get(id).password) ){
                        found = true;

                        if  (!persons.get(id).role)
                        {
                            Driver driver = new Driver();
                            driver.show_window (persons, id, persons.get(id).role);
                        }
                    }
                }
                if(!found){
                    Wrong_password w = new Wrong_password();
                    w.show_window(menuFrame.getLocation());
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuFrame.setContentPane(panel);
        menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);
        menuFrame.setSize(300, 300);
    }

}

