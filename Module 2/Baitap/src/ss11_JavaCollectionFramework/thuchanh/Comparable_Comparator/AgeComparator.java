package ss11_JavaCollectionFramework.thuchanh.Comparable_Comparator;


import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student st1, Student st2){
        if (st1.getAge() > st2.getAge()){
            return 1;
        } else if (st1.getAge() == st2.getAge()){
            return 0;
        } else {
            return -1;
        }
    }
}

