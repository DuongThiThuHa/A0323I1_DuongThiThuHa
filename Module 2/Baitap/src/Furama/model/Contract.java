package Furama.model;

public class Contract {
    private String booking; //đặt trước
    private int deposit; //đặt cọc
    private int totalBookingValue; // tổng giá trị đặt trước
    private String customerId;

    public Contract() {
    }

    public Contract(String booking, int deposit, int totalBookingValue, String customerId) {
        this.booking = booking;
        this.deposit = deposit;
        this.totalBookingValue = totalBookingValue;
        this.customerId = customerId;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalBookingValue() {
        return totalBookingValue;
    }

    public void setTotalBookingValue(int totalBookingValue) {
        this.totalBookingValue = totalBookingValue;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
