package ss14_Debug.DemoDebug.mvc.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void readFile(String src) {
        File file = new File(src);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        try {
//            readFile("/file.txt");
//        } catch (RuntimeException e) {
//            System.out.println("Đường dẫn không đúng");
//        } finally {
//            System.out.println("Kết");
//        }
        int[] numbers = {1,2,3,4,5,6};
        int index = -1;
        try {
            index = new Scanner(System.in).nextInt();
            System.out.println("Phần tử ở v trí index là: "+ numbers[index]);
        } catch (InputMismatchException e) {
            System.out.println("Nhập không đúng định dạng");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vị trí bạn nhập không tồn tại.");
        } catch (Exception e) {

        }



    }
}
