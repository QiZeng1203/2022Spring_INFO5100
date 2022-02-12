public class Shape {
    private String name;
    private double area;
    private double perimeter;

    /*Constructor
    public Shape(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }*/

    public Shape() {
        this.name = "default name";
        this.area = 0.0D;
        this.perimeter = 0.0D;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void display() {
        System.out.println("The name is " + this.getName()); //
        System.out.println("The area is " + this.getArea());
        System.out.println("The perimeter is " + this.getPerimeter());
    }
}
