package models;

public class Person {
    private String code;
    private String name;
    private String dateOfBirth;

    public Person() {
    }

    public Person(String code, String name, String dateOfBirth) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
}
