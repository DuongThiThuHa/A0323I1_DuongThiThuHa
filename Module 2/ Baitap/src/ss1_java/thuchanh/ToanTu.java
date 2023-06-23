package ss1_java.thuchanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chieu rong cua hinh chu nhat :");
        float width = scanner.nextFloat();
        System.out.println("Nhap vao chieu cao cua hinh chu nhat : ");
        float height = scanner.nextFloat();

        double S = width * height;
        System.out.println("Dien tich hinh chu nhat la :" + S);
    }
}
