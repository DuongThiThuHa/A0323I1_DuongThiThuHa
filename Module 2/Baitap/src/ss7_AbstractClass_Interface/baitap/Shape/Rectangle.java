package ss7_AbstractClass_Interface.baitap.Shape;

import ss7_AbstractClass_Interface.baitap.Resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

        super(6.0, 7.0, "Orange", false);
    }

    public Rectangle(double width, double length) {
        super(6.0, 7.0, "Orange", false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
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
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                " width = " + getWidth() +
                ", length = " + getLength() +
                super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() + (getLength() * percent / 100));
        setWidth(getWidth() + (getWidth() * percent / 100));
    }
}