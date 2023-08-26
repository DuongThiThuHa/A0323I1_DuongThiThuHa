package Furama.model;

public class Villa extends Facility {
    private String roomStandard; //phòng tiêu chuẩn
    private int numberOfFloors; //số tầng
    private double poolArea; //diện tích hồ bơi

    public Villa() {
    }


    public Villa(String name, double price, int numberOfPeople, String rentalType, double usableArea, String roomStandard, int numberOfFloors, double poolArea) {
        super(name, price, numberOfPeople, rentalType, usableArea);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa= " + super.toString() +
                ", RoomStandard: " + roomStandard +
                ", NumberOfFloors: " + numberOfFloors +
                ", PoolArea: " + poolArea;

    }
}
