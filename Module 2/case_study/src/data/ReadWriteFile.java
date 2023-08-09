package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String src, String value, boolean append) {
        File file = new File(src);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("File write error !");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("File closing error !");
            }
        }
    }


    public static List<String> readFile(String src) {
        List<String> stringList = new ArrayList<>();
        File file = new File(src);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                if (((line = bufferedReader.readLine()) != null)) {
                    stringList.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            System.out.println("File read error !");
            ;
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("File closing error !");
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        File file = new File("src/data/Employee.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Dương Thị Thu Hà - A0123I1 ");
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("File write error !");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("File closing error !");
            }
        }
    }

    File file = new File("src/data/Employee.csv");
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    {
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int temp;
            while ((temp = fileReader.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            System.out.println("File read error !");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("File closing error !");
            }
        }
    }
}
