package models;

public class Customer extends Person{
    private String customerCode;
    private String fullName;
    private String dateOfBirth;
    private String isMale;
    private String identityCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String fullName, String dateOfBirth, String isMale, String identityCard, String phoneNumber, String email, String customerType, String address) {
        this.customerCode = customerCode;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.isMale = isMale;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String code, String name, String dateOfBirth, String customerCode, String fullName, String dateOfBirth1, String isMale, String identityCard, String phoneNumber, String email, String customerType, String address) {
        super(code, name, dateOfBirth);
        this.customerCode = customerCode;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth1;
        this.isMale = isMale;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIsMale() {
        return isMale;
    }

    public void setIsMale(String isMale) {
        this.isMale = isMale;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
