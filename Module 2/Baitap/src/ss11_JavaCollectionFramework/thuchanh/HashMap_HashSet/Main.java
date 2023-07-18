package ss11_JavaCollectionFramework.thuchanh.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Student student1 = new Student(1,"T", 20,"QN");
        Student student2 = new Student(2,"H",22,"DN");

        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(3,student1);
        studentMap.put(4,student2);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("-------");

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
