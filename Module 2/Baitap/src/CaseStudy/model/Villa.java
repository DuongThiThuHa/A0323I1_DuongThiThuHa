package CaseStudy.model;

public class Villa extends Facility {
    private String room;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String room, double poolArea, int floors) {
        this.room = room;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(int code, String nameService, double area, double price, int maxPeople, String type, String room, double poolArea, int floors) {
        super(code, nameService, area, price, maxPeople, type);
        this.room = room;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
