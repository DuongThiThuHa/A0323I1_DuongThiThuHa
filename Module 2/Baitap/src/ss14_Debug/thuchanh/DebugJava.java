package ss14_Debug.thuchanh;

import java.util.Scanner;

public class DebugJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac nhat co dang : ax + b = c");
        System.out.println("Nhap vao gia tri a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao gia tri b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao gia tri c : ");
        double c = Double.parseDouble(scanner.nextLine());
        double x = 0;

        if (a == 0) {
            System.out.println("Gia tri a khong phu hop");
        } else if (b > 0 && a != 0) {
            x = (c - b) / a;
            System.out.println("Gia tri cua x la : " + x);
        } else if (b < 0 && a != 0) {
            x = (c + b) / a;
            System.out.println("Gia tri cua x la : " + x);
        }
    }
}
