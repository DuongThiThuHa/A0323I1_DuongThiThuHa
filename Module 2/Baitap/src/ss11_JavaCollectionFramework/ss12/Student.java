package ss11_JavaCollectionFramework.ss12;

public class Student implements Comparable<Student> {
    int codeStudent;
    String nameStudent;
    String dateOfBirth;

    public Student() {
    }

    public Student(int codeStudent, String nameStudent, String dateOfBirth) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        if(this.codeStudent < o.codeStudent) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeStudent=" + codeStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
