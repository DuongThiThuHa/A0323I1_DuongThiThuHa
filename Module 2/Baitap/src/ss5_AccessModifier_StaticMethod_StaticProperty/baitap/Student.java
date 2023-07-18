package ss5_AccessModifier_StaticMethod_StaticProperty.baitap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String className) {
        this.name = name;
        this.classes = className;
    }

    public Student(int i, String haiTT, String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return classes;
    }

    public void setClassName(String className) {
        this.classes = className;
    }

public static class TestStudent{
    public static void main(String[] args) {
        Student testStudent = new Student();
        testStudent.setName("Jenny");
        testStudent.setClassName("A05");
        System.out.println("Ten cua ban la :" + testStudent.getName());
        System.out.println("Lop cua ban la : " + testStudent.getClassName());
    }
    }
}
