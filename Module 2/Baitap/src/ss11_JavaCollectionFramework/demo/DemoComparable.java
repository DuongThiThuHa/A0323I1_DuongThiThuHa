package ss11_JavaCollectionFramework.demo;

import ss5_AccessModifier_StaticMethod_StaticProperty.baitap.Student;

import java.util.Set;
import java.util.TreeSet;

public class DemoComparable {


    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student(1,"haiTT", "12/12/1222"));
        set.add(new Student(2,"haiTT1", "12/12/1222"));
        set.add(new Student(0,"haiTT0", "12/12/1222"));
        for (Student student: set) {
            System.out.println(student);
        }
    }
}
