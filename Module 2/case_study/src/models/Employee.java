package models;

public class Employee extends Person{
    private String employeeCode;
    private String fullName;
    private String dateOfBirth;
    private String isMale;
    private String identityCard;
    private String phoneNumber;
    private String email;
    private String level;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String employeeCode, String fullName, String dateOfBirth, String isMale, String identityCard, String phoneNumber, String email, String level, String position, Double salary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.isMale = isMale;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String code, String name, String dateOfBirth, String employeeCode, String fullName, String dateOfBirth1, String isMale, String identityCard, String phoneNumber, String email, String level, String position, Double salary) {
        super(code, name, dateOfBirth);
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth1;
        this.isMale = isMale;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
