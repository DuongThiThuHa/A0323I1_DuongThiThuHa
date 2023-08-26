package Furama.model;

public class Room extends Facility {
    private String freeService; // dịch vụ miễn phí

    public Room() {
    }

    public Room(String name, double price, int numberOfPeople, String rentalType, double usableArea, String freeService) {
        super(name, price, numberOfPeople, rentalType, usableArea);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room= " + super.toString() +
                ", FreeService: " + freeService
                ;
    }
}
