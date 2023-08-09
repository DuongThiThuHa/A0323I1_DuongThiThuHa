package models;

public class Room extends Facility {
    private String voucher ;

    public Room() {
    }

    public Room(String voucher) {
        this.voucher = voucher;
    }

    public Room(String code, String nameService, String area, int cost, int maxPeople, String type, String voucher) {
        super(code, nameService, area, cost, maxPeople, type);
        this.voucher = voucher;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
}
