import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> persons;
    public String alert;

    public SeattlePoliceDepartment() {
        this.persons = new ArrayList<>();
    }

    public void NotifyCitizens(String alert) {
        this.alert = alert;
        for (Person per: persons) {
            per.getNotification(this);
        }
    }
}
