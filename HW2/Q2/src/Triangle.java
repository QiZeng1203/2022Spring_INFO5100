public class Triangle extends Shape {
    private float base;
    private float height;

    // Constructor
    public Triangle(float base, float height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(float side) {
        super();
        this.base = side;
        this.height = (float) (Math.sqrt(3)/2 * side);
    }

    // Getter and setter

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea() {
        return (float) (height * base * 0.5);
    }

    @Override
    public float getPerimeter() {
        return (float) (base + 2 * Math.sqrt(Math.pow((base / 2),2) + Math.pow(height, 2)));
    }
}
