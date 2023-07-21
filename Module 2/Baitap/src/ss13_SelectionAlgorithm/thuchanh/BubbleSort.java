package ss13_SelectionAlgorithm.thuchanh;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean isSwap = true;
        for (int i = 0; i < arr.length && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int change = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = change;
                    isSwap = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang : ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap vao gai tri phan tu tai vi tri thu " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mang sau khi duoc sap xep : " + arr[i]);
        }
    }
}
