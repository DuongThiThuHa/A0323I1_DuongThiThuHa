package ss16_IOBinaryFile_Serialization.Demo;

import java.io.Serializable;

public class Student implements Serializable {
    private int code;
    private String name;
    private String dateOfBirth;

    public Student() {
    }

    public Student(int code, String name, String dateOfBirth) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

    @Override
    public String toString() {
        return "BenhThuong{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
