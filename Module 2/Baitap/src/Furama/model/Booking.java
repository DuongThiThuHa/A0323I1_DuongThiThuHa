package Furama.model;

import java.util.Date;

public class Booking {
    private String code; //mã số
    private Date checkIn;
    private Date checkOut;
    private String customerId; //cmnd khách hàng
    private String service; //dịch vụ

    public Booking() {
    }

    public Booking(String code, Date checkIn, Date checkOut, String customerId, String service) {
        this.code = code;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.customerId = customerId;
        this.service = service;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

//    @Override
//    public String toString() {
//        return "Booking{" +
//                "code='" + code + '\'' +
//                ", checkIn=" + checkIn +
//                ", checkOut=" + checkOut +
//                ", customerId='" + customerId + '\'' +
//                ", service='" + service + '\'' +
//                '}';
//    }
}
