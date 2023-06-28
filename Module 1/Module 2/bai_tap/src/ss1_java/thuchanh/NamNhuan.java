package ss1_java.thuchanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam muon tim : ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year+" la nam nhuan");
                }
                else {
                    System.out.println(year + " la nam khong nhuan");
                }
            }else {
                System.out.println(year+" la nam nhuan");
            }
        } else {
            System.out.println(year+" la nam khong nhuan");
        }
    }
}
