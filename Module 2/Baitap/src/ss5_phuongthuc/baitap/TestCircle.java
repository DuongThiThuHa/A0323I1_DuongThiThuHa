package ss5_phuongthuc.baitap;

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
        public static void main(String[] args) {
            Circle circle2 = new Circle(2.5);
            System.out.println("Ban kinh : " + circle2.getRadius());
            System.out.println("Dien tich : " + circle2.getArea());
        }
    }
}
