package ss6_Inheritance.thuchanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {

        return width * this.length;
    }

    public double getPerimeter() {

        return 2 * (width + this.length);
    }
    @Override
    public String toString() {
        return "A Rectagnle with width = " + width + " and length = " + length + " , which is a subclass of" + super.toString();
    }

    public static class Square {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle = new Rectangle(2.5, 3.5, "Yellow",false);
            System.out.println(rectangle);
        }
    }
}
