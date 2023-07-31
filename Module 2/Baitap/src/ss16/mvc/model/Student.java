package ss16.mvc.model;

public class Student extends Person {
    private double grade;

    public Student() {
    }

    public Student(int code, String name, String dateOfBirth) {
        super(code, name, dateOfBirth);
    }

    public Student(double grade) {
        this.grade = grade;
    }

    public Student(int code, String name, String dateOfBirth, double grade) {
        super(code, name, dateOfBirth);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Mã: " +super.getCode()+ " , Tên: "+super.getName()+ " , Ngày sinh: "+ super.getDateOfBirth()+  " , Điểm: " + grade ;
    }
}
