package ss3_ArraysAndMethods.baitap;

import java.util.Scanner;

public class TongMotCot {
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
        System.out.println("Nhap vao so thu tu cot muon tinh tong: ");
        int x = scanner.nextInt();

        for (int k = 0; k < row; k++) {
            if (x >= 0 && x < col){
                sum += array[k][x];
            }else {
                System.out.println("Cot khong ton tai ");
            }
        }
        System.out.println("Tong cac so o cot " + x + " la " + sum);

    }
}
