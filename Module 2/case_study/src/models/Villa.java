package models;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int numFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numFloors) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numFloors = numFloors;
    }

    public Villa(String code, String nameService, String area, int cost, int maxPeople, String type, String roomStandard, double areaPool, int numFloors) {
        super(code, nameService, area, cost, maxPeople, type);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numFloors = numFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }
}
