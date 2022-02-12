public class Triangle extends Shape {
    private float base;
    private float height;

    public Triangle(float side) {
        super();
        this.base = side;
        this.height = (float) (Math.sqrt(3)/2 * side);
    }

    @Override
    public float getArea() {
        return (float) (height * base * 0.5);
    }

    @Override
    public float getPerimeter() {
        return base * 3;
    }
}
