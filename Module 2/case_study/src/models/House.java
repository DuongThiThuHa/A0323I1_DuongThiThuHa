package models;

public class House extends Facility {
    private String roomStandard;
    private int numFloors;

    public House() {
    }

    public House(String roomStandard, int numFloors) {
        this.roomStandard = roomStandard;
        this.numFloors = numFloors;
    }

    public House(String code, String nameService, String area, int cost, int maxPeople, String type, String roomStandard, int numFloors) {
        super(code, nameService, area, cost, maxPeople, type);
        this.roomStandard = roomStandard;
        this.numFloors = numFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }
}
