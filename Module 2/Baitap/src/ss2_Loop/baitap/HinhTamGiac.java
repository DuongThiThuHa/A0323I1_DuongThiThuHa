package ss2_Loop.baitap;

import java.util.Scanner;

public class HinhTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao hinh tam giac : ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.println("x");
            }
            System.out.println();
        }
    }
}
