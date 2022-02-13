public class Rhombus extends Shape{
    private float diagonalD1;
    private float diagonalD2;

    // Constructor
    public Rhombus(float diagonalD1, float diagonalD2) {
        super();
        this.diagonalD1 = diagonalD1;
        this.diagonalD2 = diagonalD2;
    }

    public Rhombus(float diagonalD1) {
        super();
        this.diagonalD1 = diagonalD1;
        this.diagonalD2 = diagonalD1;
    }

    // Getter and setter
    public float getDiagonalD1() {
        return diagonalD1;
    }

    public void setDiagonalD1(float diagonalD1) {
        this.diagonalD1 = diagonalD1;
    }

    public float getDiagonalD2() {
        return diagonalD2;
    }

    public void setDiagonalD2(float diagonalD2) {
        this.diagonalD2 = diagonalD2;
    }

    @Override
    public float getArea() {
        return (float) (diagonalD1 * diagonalD2 * 0.5);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.sqrt(Math.pow(diagonalD1, 2) + Math.pow(diagonalD2, 2)));
    }
}
