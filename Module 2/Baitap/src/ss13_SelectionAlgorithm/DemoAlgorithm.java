package ss13_SelectionAlgorithm;

import java.util.Scanner;

public class DemoAlgorithm {

    public static void bubbleSort(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu trong mang :");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " +i+ " trong mang: ");
        }

        boolean isSwap = true;
        for (int i = 0; i < arr.length - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                    isSwap = true;
                }
            }
        }
    }


    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
