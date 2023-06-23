package ss3_mang.thuchanh;

import java.util.Scanner;

public class MinMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu trong mang : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri vao mang tai vi tri " + i);
            arr[i]=scanner.nextInt();
        }
        int index = minValue(arr);
        System.out.println("So nho nhat trong mang la : " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
