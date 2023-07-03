package ss2_Loop.thuchanh;

import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tien = 1.0;
        int thang = 1;
        double tyLe = 1.0;
        double tong = 0;

        System.out.println("Nhap vao so tien cho vay");
        tien = scanner.nextDouble();
        System.out.println("nhap vao so thang cho vay");
        thang = scanner.nextInt();
        System.out.println("Nhao vao ti le lai suat hang thang ");
        tyLe = scanner.nextDouble();
        for (int i = 0; i < thang; i++) {
            tong += tien * (tyLe / 100) / 12 * thang;
        }
        System.out.println("So tien lai nhan duoc sau " + thang + " la :" + tong);
    }
}
