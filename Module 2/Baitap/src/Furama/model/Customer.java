package Furama.model;

import java.time.LocalDate;

public class Customer extends Person {
    private String tyle;

    public Customer() {
    }

    public Customer(String tyle) {
        this.tyle = tyle;
    }

    public Customer(String id, String name, LocalDate age, String sex, String address, String idCard, String email, String tyle) {
        super(id, name, age, sex, address, idCard, email);
        this.tyle = tyle;
    }

    public String getTyle() {
        return tyle;
    }

    public void setTyle(String tyle) {
        this.tyle = tyle;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tyle='" + tyle + '\'' +
                '}';
    }
}
