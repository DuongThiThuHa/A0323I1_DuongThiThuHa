package ss4_lop.baitap;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if (isOn()) {
            System.out.println("Fan 1 : ");
            return "Toc do : " + speed + ", Mau sac: " + color + ", Ban kinh : " + radius + ", Quat dang bat";
        } else {
            System.out.println("Fan 2 : ");
            return "Mau sac: " + color + ", Ban kinh : " + radius + ", Quat dang tat";
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getFast());
        fan1.setColor("Yellow");
        fan1.setRadius(10);


        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5);
        fan2.setColor("Blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
