package Furama.model;

public class House extends Facility {
    private String roomStandard; //phòng tiêu chuẩn
    private int numberOfFloors; //số tầng

    public House() {
    }

    public House(String name, double price, int numberOfPeople, String rentalType, double usableArea, String roomStandard, int numberOfFloors) {
        super(name, price, numberOfPeople, rentalType, usableArea);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
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

    @Override
    public String toString() {
        return "House = " + super.toString() +
                ", RoomStandard: " + roomStandard +
                ", NumberOfFloors: " + numberOfFloors
                ;
    }
}
