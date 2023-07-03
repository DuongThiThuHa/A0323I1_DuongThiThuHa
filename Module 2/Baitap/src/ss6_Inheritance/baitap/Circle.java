package ss6_Inheritance.baitap;

public class Circle {
    public double radius = 5.0;
    public String color = "Blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Radius = " + getRadius() + " and color : " + getColor();
    }


}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cycinder is height = " + getHeight();
    }
}

class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(3, "blue", 10);
        System.out.println(cylinder.getHeight());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());

    }
}