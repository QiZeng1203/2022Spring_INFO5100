public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.rollNumber = student.rollNumber;
    }

    public int printRoll() {
        //System.out.println(getRollNumber());
        return getRollNumber();
    }

    public String printName() {
        //System.out.println(getName());
        return getName();
    }
}
