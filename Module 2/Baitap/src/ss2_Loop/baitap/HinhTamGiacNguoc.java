package ss2_Loop.baitap;

import java.util.Scanner;

public class HinhTamGiacNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao hinh tam giac : ");
        int height = scanner.nextInt();
        for (int i = height; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println("x");
            }
            System.out.println();
        }
    }
}
