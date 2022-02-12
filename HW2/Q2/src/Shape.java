public class Shape {
    private String name;
    private String color;
    private float area;
    private float perimeter;

    //Constructor
    public Shape(String name, String color, float area, float perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape() {

    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    //
    public String printShape() {
        return getName();
    }



}
