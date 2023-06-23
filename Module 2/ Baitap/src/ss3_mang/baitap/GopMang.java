package ss3_mang.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai cua mang thu 1 ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu "+i+" vao mang thu 1");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhap vao chieu dai cua mang thu 2");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int j = 0; j < m; j++) {
            System.out.println("Nhap phan tu thu "+j+"vao mang thu 2");
            array2[j] = scanner.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1,0,array3,0,n);
        System.arraycopy(array2,0,array3,n,m);

        System.out.println("mang sau khi gộp la : ");
        for (int k = 0; k < array3.length; k++) {
            System.out.println(array3[k] + " ");
        }
    }

}
