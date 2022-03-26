public class Student {

    private String name;
    private int studentId;
    private float gpa;

    // constructor
    public Student(String name, int studentId, float gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student (){
        this.name = "default student";
        this.studentId = 1;
        this.gpa = 4.0f;
    };

    // copy constructor
    public Student (Student student){
        this.name = student.name;
        this.studentId = student.studentId;
        this.gpa = student.gpa;
    }


}
