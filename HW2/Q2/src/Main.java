public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape s = new Shape("Shape1", "Red");
        Triangle t1 = new Triangle(2.0F);
        t1.setName("t1");
        Triangle t2 = new Triangle(2.0F, 2.0F);
        t2.setName("t2");
        Rhombus r1 = new Rhombus(6.0F, 8.0F);
        r1.setName("r1");
        Rhombus r2 = new Rhombus(6.0F);
        r2.setName("r2");
        s.printShape();
        t1.printShape();
        t2.printShape();
        r1.printShape();
        r2.printShape();
    }
}
