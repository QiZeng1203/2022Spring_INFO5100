public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNotification(SeattlePoliceDepartment spd) {
        System.out.println("********");
        System.out.println("Notification: " + spd.alert);
        System.out.println("Person Name: " + this.getName());
        System.out.println("********");
    }

    public void subscribe(SeattlePoliceDepartment spd) {
        if(! spd.persons.contains(this)) {
            spd.persons.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment spd) {
        spd.persons.remove(this);
    }
}
