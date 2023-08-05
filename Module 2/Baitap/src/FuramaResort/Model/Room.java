package FuramaResort.Model;

public class Room extends Facility{
    private double length;
    private double breadth;
    private double height;

    public Room() {
    }

    public Room(String serviceName, String phoneNumber, String address) {
        super(serviceName, phoneNumber, address);
    }

    public Room(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Room(String serviceName, String phoneNumber, String address, double length, double breadth, double height) {
        super(serviceName, phoneNumber, address);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }
}
