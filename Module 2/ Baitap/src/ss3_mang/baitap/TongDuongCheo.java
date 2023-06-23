package ss3_mang.baitap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so hang cua mang: ");
        int row = scanner.nextInt();
        System.out.println("Nhap vao so cot cua mang: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap vao phan tu tai vi tri [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (row = 0; row < array.length; row++) {
            for (col = 0; col < array[row].length; col++) {
                if (row == col) {
                    sum += array[row][col];
                }
            }
        }
        System.out.println("Tong duong cheo la : " + sum);
    }
}
