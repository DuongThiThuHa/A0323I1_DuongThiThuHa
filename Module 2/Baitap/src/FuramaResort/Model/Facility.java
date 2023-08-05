package FuramaResort.Model;

public abstract class Facility {
    private String serviceName;
    private String phoneNumber;
    private String address;

    public Facility() {
    }

    public Facility(String serviceName, String phoneNumber, String address) {
        this.serviceName = serviceName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
