public class Main {

    public static void main(String[] args) {
        // Q2
        /* The Difference between abstract class and interface
        1. a class can only extend one abstract class, but can implement multiply interface.
        2. abstract class can have data field, but interface cannot have data field.
        3. abstract class can have abstract or concrete method, but interface has only abstract method.
        4. abstract class can declare the constructor. but interface cannot declare the constructor
	 */
        Psychiatrist psychiatrist = new Psychiatrist();
        Sad sad = new Sad();
        Happy happy = new Happy();

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        //System.out.println(happy.getMood());
        //happy.expressFeelings();
        //System.out.println(happy.toString());

        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
        //System.out.println(sad.getMood());
        //sad.expressFeelings();
        //System.out.println(sad.toString());

    }
}
