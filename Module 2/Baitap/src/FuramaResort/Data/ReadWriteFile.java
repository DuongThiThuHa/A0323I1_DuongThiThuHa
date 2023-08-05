package FuramaResort.Data;

import FuramaResort.Model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {

    public static final String SRC_EMPLOYEE = "src/FuramaResort/Data/Data.csv";
    public static void WriteFile(String src, String value , boolean append){
        File file = new File(src);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
//            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }

    }

    public static List<String> ReadFile( String src){
        List<String> stringList = new ArrayList<>();
        File file = new File(src);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc ghi file");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
//        File file = new File(SRC_EMPLOYEE);
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(file,true);
//            fileWriter.write("Dương Thị Thu Hà - A0323I1");
//        } catch (IOException e) {
//            System.out.println("Lỗi ghi file");
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("Lỗi đóng file");
//            }
//        }


        File file = new File(SRC_EMPLOYEE);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int temp ;
            while ((temp = fileReader.read()) != -1){
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc ghi file");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }
}
