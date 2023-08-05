package CaseStudy.model;

public class House extends Facility {
    private int floors;
    private String roomStandard;

    public House() {
    }

    public House(int floors, String roomStandard) {
        this.floors = floors;
        this.roomStandard = roomStandard;
    }

    public House(int code, String nameService, double area, double price, int maxPeople, String type, int floors, String roomStandard) {
        super(code, nameService, area, price, maxPeople, type);
        this.floors = floors;
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }
}
