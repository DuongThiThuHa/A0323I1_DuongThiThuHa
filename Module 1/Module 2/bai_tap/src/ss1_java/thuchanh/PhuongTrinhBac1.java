package ss1_java.thuchanh;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();
        double x = 0;

        System.out.println("Phuong trinh co dang : ax + b = c ");
        if (a != 0) {
            x = (c - b) / a;
            System.out.println("Phuong trinh co nghiem : " + x);
        } else if (b == c) {
            System.out.println("Phuong trinh vo nghiem ! ");
        } else {
            System.out.println("Phuong trinh co vo so nghiem !");
        }
    }
}

