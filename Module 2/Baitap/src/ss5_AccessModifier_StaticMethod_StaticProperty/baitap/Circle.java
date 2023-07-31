package ss5_AccessModifier_StaticMethod_StaticProperty.baitap;

import ss7_AbstractClass_Interface.ComparableCircle;

public abstract class Circle {
    private static double radius = 1.0;
    private final String color = "Red";

    public Circle(double radius, String color, boolean filled) {
    }

    public Circle(double radius) {
        Circle.radius = Circle.radius;
    }

    public Circle() {

    }


    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        Circle.radius = radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle(radius) {
            @Override
            public int compareTo(ComparableCircle o) {
                return 0;
            }
        };
        System.out.println("Ban kinh : " + circle1.getRadius());
        System.out.println("Dien tich : " + circle1.getRadius());
    }

    public abstract int compareTo(ComparableCircle o);
}
