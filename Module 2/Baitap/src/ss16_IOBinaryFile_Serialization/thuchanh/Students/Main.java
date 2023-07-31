package ss16_IOBinaryFile_Serialization.thuchanh.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dương Văn A", "Quảng Nam"));
        students.add(new Student(2, "Dương Văn B", "Quảng Nam"));
        students.add(new Student(3, "Dương Văn C", "Quảng Nam"));
        students.add(new Student(4, "Dương Văn D", "Quảng Nam"));
        students.add(new Student(5, "Dương Văn E", "Quảng Nam"));

        writeToFile("src/ss16_IOBinaryFile_Serialization/thuchanh/Students/Student.csv", students);
        List<Student> studentDataFromFile = readDataFromFile("src/ss16_IOBinaryFile_Serialization/thuchanh/Students/Student.csv");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file !");
        } catch (IOException e) {
            System.out.println("Lỗi đọc ghi file !");
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
