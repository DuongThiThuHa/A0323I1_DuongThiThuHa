package FuramaResort.Model;

public class Employee extends Person{
    private int code;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String address, String dateOfBirth) {
        super(name, address, dateOfBirth);
    }

    public Employee(int code, String position, double salary) {
        this.code = code;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String address, String dateOfBirth, int code, String position, double salary) {
        super(name, address, dateOfBirth);
        this.code = code;
        this.position = position;
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeService{" +
                "code=" + code +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
