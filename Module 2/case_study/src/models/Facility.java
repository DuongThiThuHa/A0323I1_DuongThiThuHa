package models;

public class Facility {
    private String code;
    private String nameService;
    private String area ;
    private int cost;
    private int maxPeople;
    private String type;

    public Facility() {
    }

    public Facility(String code, String nameService, String area, int cost, int maxPeople, String type) {
        this.code = code;
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
