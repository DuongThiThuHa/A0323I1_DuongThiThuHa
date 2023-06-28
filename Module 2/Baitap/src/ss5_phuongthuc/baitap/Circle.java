package ss5_phuongthuc.baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        System.out.println("Ban kinh : " + circle1.getRadius());
        System.out.println("Dien tich : " + circle1.getRadius());
    }
}
