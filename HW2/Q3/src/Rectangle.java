public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle (double length, double width) {
        super();
        this.setName("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void computeArea() {
        System.out.println("The rectangle area is "+ length*width);
    }

    public void computePerimeter() {
        System.out.println("The rectangle perimeter is "+ 2* (length + width));
    }

    public void display() {
        System.out.println("The name is " + this.getName()); //
        this.computeArea();
        this.computePerimeter();
    }
}
