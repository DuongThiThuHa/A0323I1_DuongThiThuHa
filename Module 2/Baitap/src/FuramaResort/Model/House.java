package FuramaResort.Model;

public class House extends Facility{
    private int numberOfRoom;
    private double area;
    private double price;

    public House() {
    }

    public House(String serviceName, String phoneNumber, String address) {
        super(serviceName, phoneNumber, address);
    }

    public House(int numberOfRoom, double area, double price) {
        this.numberOfRoom = numberOfRoom;
        this.area = area;
        this.price = price;
    }

    public House(String serviceName, String phoneNumber, String address, int numberOfRoom, double area, double price) {
        super(serviceName, phoneNumber, address);
        this.numberOfRoom = numberOfRoom;
        this.area = area;
        this.price = price;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRoom=" + numberOfRoom +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
