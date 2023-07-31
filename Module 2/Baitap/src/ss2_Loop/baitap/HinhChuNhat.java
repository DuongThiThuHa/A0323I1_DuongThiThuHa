package ss2_Loop.baitap;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua HCN : ");
        int height = scanner.nextInt();
        System.out.println("Nhap vao chieu rong cua HCN : ");
        int width = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.println("x");
            }
            System.out.println();
        }
    }
}
