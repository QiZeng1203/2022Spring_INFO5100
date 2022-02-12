public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape s = new Shape("Shape1", "Red");
        Triangle t = new Triangle(2.0F);
        Parallelogram p1 = new Parallelogram(4.0F, 3.0F, 5.0F);
        Parallelogram p2 = new Parallelogram(6.0F);
        System.out.println(s.printShape());
        System.out.println("The area of triangle is " + t.getArea());
        System.out.println("The perimeter of triangle is "+ t.getPerimeter());
        System.out.println(p1.getArea());
        System.out.println(p1.getPerimeter());
        System.out.println(p2.getArea());
        System.out.println(p2.getPerimeter());

    }
}
