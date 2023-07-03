package ss5_AccessModifier_StaticMethod_StaticProperty.baitap;

import ss7_AbstractClass_Interface.ComparableCircle;

public class TestCircle {

    private double radius = 1.0;
    private String color = "Red";

    public void testCircle() {
    }

    public TestCircle(double radius, String color) {
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

    public static class testCircle {
        private static double radius;

        public static void main(String[] args) {
            Circle circle2 = new Circle(radius) {
                @Override
                public int compareTo(ComparableCircle o) {
                    return 0;
                }
            };
            System.out.println("Ban kinh : " + circle2.getRadius());
            System.out.println("Dien tich : " + circle2.getArea());
        }
    }
}
