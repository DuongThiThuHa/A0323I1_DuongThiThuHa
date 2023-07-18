package ss11_JavaCollectionFramework.thuchanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"H",22,"DN");
        Student student1 = new Student(2,"T",30,"QN");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        Collections.sort(list);
        for (Student student2 : list){
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi : "+ student.toString());
        for (Student student2  : list){
            System.out.println(student.toString());
        }

    }
}
