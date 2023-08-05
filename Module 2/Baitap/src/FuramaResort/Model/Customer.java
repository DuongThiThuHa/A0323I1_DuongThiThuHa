package FuramaResort.Model;

public class Customer extends Person{
    private int code;
    private double discount;

    public Customer() {
    }

    public Customer(String name, String address, String dateOfBirth) {
        super(name, address, dateOfBirth);
    }

    public Customer(int code, double discount) {
        this.code = code;
        this.discount = discount;
    }

    public Customer(String name, String address, String dateOfBirth, int code, double discount) {
        super(name, address, dateOfBirth);
        this.code = code;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code=" + code +
                ", discount=" + discount +
                '}';
    }
}
