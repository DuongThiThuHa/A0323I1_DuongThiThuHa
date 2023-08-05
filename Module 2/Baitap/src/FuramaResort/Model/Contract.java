package FuramaResort.Model;

public class Contract {
    private int code;
    private String nameCustomer;
    private String checkinDate;
    private String checkoutDate;

    public Contract() {
    }

    public Contract(int code, String nameCustomer, String checkinDate, String checkoutDate) {
        this.code = code;
        this.nameCustomer = nameCustomer;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "code=" + code +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", checkinDate='" + checkinDate + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                '}';
    }
}
