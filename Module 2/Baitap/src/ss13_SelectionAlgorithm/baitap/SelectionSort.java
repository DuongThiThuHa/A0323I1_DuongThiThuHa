package ss13_SelectionAlgorithm.baitap;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu co trong mang : ");
        int number = Integer.parseInt(scanner.nextLine());
        double[] list = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Gia tri phan tu tai vi tri thu "+ i);
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
