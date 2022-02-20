public class Student extends Person{

    public Student(String name,int ID,int age) {
        super(name, ID, age);
    }

    public void takeQuiz(String Str) {
        System.out.println("Student is taking Quiz");
    }
}
