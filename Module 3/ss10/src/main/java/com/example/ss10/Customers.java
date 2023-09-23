package com.example.ss10;

public class Customers {
    private int code;
    private String name;
    private String dateOfBirth;
    private String address;

    public Customers(int code, String name, String dateOfBirth, String address) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
