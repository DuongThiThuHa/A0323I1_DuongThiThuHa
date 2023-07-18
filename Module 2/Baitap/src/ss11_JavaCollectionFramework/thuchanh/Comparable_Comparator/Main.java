package ss11_JavaCollectionFramework.thuchanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"TH",22,"QN");
        Student student2 = new Student(2,"DH",22,"DN");
        Student student3 = new Student(3,"MH",23,"QN");
        Student student4 = new Student(4,"AQ",23,"DN");

        List<Student> list = new ArrayList<Student>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        Collections.sort(list);
        System.out.println("Sap xep theo ten: ");
        for (Student student : list){
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student student : list){
            System.out.println(student.toString());
        }
    }
}
