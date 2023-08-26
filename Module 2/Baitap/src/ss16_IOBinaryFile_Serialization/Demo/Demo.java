package ss16_IOBinaryFile_Serialization.Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        List<BenhThuong> students = new ArrayList<>();
//        students.add(new BenhThuong(1,"TH","24/12"));
//        students.add(new BenhThuong(2,"TH","24/12"));
//        students.add(new BenhThuong(3,"TH","24/12"));
//        students.add(new BenhThuong(4,"TH","24/12"));
//
//      File file = new File("src/ss16_IOBinaryFile_Serialization/Demo/text.txt");
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(students);
//        } catch (FileNotFoundException e) {
//            System.out.println("Loi khong tim thay file");
//        } catch (IOException e) {
//            System.out.println("Loi ghi file");
//        } finally {
//            try {
//                assert objectOutputStream != null;
//                objectOutputStream.close();
//            } catch (IOException e) {
//                System.out.println("Loi dong file");
//            }
//        }


        File file = new File("src/ss16_IOBinaryFile_Serialization/Demo/text.txt");
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> studentList = (List<Student>)objectInputStream.readObject();
            System.out.println(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("Loi khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        } catch (ClassNotFoundException e) {
            System.out.println("Loi khong tim thay danh sach");
        } finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Loi xuat file");
            }
        }

    }
}
