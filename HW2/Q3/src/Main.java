public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}
