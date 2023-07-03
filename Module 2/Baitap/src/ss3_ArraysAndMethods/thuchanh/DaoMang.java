package ss3_ArraysAndMethods.thuchanh;

import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao 1 so bat ki :");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array;
        do {
            if (size > 20){
                System.out.println("Kich thuoc mang qua 20 phan tu ");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap gia tri phan tu tai vi tri "+i+" vao mang");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mang vua nhap la : ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        //1 2 3 5 4
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 -i] = temp;
        }

        System.out.println("Mang sau khi dao cac phan tu ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
