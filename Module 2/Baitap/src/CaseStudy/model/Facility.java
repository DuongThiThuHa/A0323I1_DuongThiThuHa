package CaseStudy.model;

public abstract class Facility {
    private int code;
    private String nameService;
    private double area;
    private double price;
    private int maxPeople;
    private String type;

    public Facility() {
    }

    public Facility(int code, String nameService, double area, double price, int maxPeople, String type) {
        this.code = code;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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
