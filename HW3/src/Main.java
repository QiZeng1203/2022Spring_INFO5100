public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person("Tom", 20);
        Person p2 = new Person("Peter", 30);
        Person p3 = new Person("Mark", 25);
        Person p4 = new Person("Bob", 35);

        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();

        p1.subscribe(spd);
        p2.subscribe(spd);
        p4.subscribe(spd);

        spd.NotifyCitizens("Message from Seattle Police Department");

        p1.unsubscribe(spd);
        p3.subscribe(spd);
        spd.NotifyCitizens("The Second Message from Seattle Police Department");
    }
}
