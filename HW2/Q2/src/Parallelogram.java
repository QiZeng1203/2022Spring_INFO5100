public class Parallelogram extends Shape{
    private float base;
    private float height;
    private float side;

    public Parallelogram(float base, float height, float side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }
//when there is only side parameter, considering the parallelogram as a rectangle
    public Parallelogram(float side) {
        super();
        this.base = side;
        this.height = side;
        this.side = side;
    }

    @Override
    public float getArea() {
        return base * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (base + side);
    }

}
