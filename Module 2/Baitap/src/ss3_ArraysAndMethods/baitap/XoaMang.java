package ss3_ArraysAndMethods.baitap;

import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua mang: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri cua mang tai vi tri " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhap vao phan tu can xoa :");
        int x = scanner.nextInt();

        int arr = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == x) {
                System.out.println("Vi tri cua phan tu trong mang " + x + " la " + (j + 1));
                arr = j;
            }
        }
        if (arr == 0) {
            System.out.println("Khong tim thay phan tu " + x + " trong mang");
        }

        int count = 0 ;
        for (int i = count = 0; i < n; i++) {
            if (array[i] != x){
                array[count] = array[i];
                count++;
            }
        }
        n = count ;
        System.out.println("Mang sau khi xoa phan tu "+x +" la");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
