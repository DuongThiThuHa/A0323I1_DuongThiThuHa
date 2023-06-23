package ss1_java.thuchanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phuong trinh bac nhat co dang : ax + b = 0");
        System.out.println("Nhap vao so a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao so b : ");
        double b = scanner.nextDouble();
        double x;

        if (a != 0) {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem :" + x);
        } else if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
