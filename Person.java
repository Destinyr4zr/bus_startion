import java.util.ArrayList;

public class Person {
    String name;
    String password;
    boolean role;
    ArrayList<Rout> routs = new ArrayList<Rout>();
    Person(String Name, String Password, boolean Role){
        name = Name;
        password = Password;
        role = Role;
    }
    public void change_data(String Name, String Password, boolean Role) {
        name = Name;
        password = Password;
        role = Role;
    }


}
class Rout{
    String start_city;
    String end_city;
    String start_time;
    String end_time;
    Rout(String Start_city, String End_city, String Start_time, String End_time){
        start_city = Start_city;
        end_city = End_city;
        start_time = Start_time;
        end_time = End_time;
    }
}
