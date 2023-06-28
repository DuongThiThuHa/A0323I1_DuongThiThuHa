package ss6_kethua.thuchanh;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

    public static class shapeTest {
        public static void main(String[] args) {
            Shape shape = new Shape();
            shape = new Shape("Red", false);
            System.out.println(shape);
            shape = new Shape("Blue", true);
            System.out.println(shape);
        }
    }
}
