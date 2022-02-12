public class Circle extends Shape {
    private double radius;

    //Constructor
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.setName("Circle");
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        System.out.println("The area of circle is " + Math.pow (radius, 2) * Math.PI);
    }

    public void computePerimeter() {
        System.out.println("The perimeter of Circle is " + Math.PI * radius);
    }

    public void display() {
        System.out.println("The name is " + this.getName()); //
        this.computeArea();
        this.computePerimeter();
    }
}
