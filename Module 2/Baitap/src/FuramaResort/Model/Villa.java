package FuramaResort.Model;

public class Villa extends Facility{
    private int numberOfRoom;
    private double area;
    private double price;

    public Villa() {
    }

    public Villa(String serviceName, String phoneNumber, String address) {
        super(serviceName, phoneNumber, address);
    }

    public Villa(int numberOfRoom, double area, double price) {
        this.numberOfRoom = numberOfRoom;
        this.area = area;
        this.price = price;
    }

    public Villa(String serviceName, String phoneNumber, String address, int numberOfRoom, double area, double price) {
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
        return "Villa{" +
                "numberOfRoom=" + numberOfRoom +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
