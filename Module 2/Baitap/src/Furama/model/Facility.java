package Furama.model;

public abstract class Facility {
    private String name; // tên dịch vụ
    private double price; //giá
    private int numberOfPeople; // số lượng người
    private String rentalType; //kiểu cho thuê
    private double usableArea; //diện tích sử dụng được

    public Facility() {
    }

    public Facility(String name, double price, int numberOfPeople, String rentalType, double usableArea) {
        this.name = name;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
        this.usableArea = usableArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                        ", price=" + price +
                        ", numberOfPeople=" + numberOfPeople +
                        ", rentalType=" + rentalType +
                        ", usableArea=" + usableArea
                ;
    }
}
