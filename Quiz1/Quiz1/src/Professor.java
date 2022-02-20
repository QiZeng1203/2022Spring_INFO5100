public class Professor extends Person {
    private String giveQuiz;

    public Professor(String name,int ID,int age) {
        super(name, ID, age);
    }

    public void giveQuiz (String str) {
        System.out.println("Professor is giving Quiz");
    }
}
