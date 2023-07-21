package ss12_SearchAlgorithm.baitap;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RecursiveBinary {
    public static int binarySearch(int[] arr, int value, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (arr[middle] == value) {
            return middle;
        } else if (arr[middle] < value) {
            return binarySearch(arr, value, middle + 1, right);
        } else {
            return binarySearch(arr, value, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu can khoi tao trong mang: ");
        int n = parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap vao gia tri phan tu tai vi tri thu "+i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap vao phan tu can tim kiem : ");
        int value = Integer.parseInt(scanner.nextLine());

        int index = binarySearch(arr, value, 0, arr.length - 1);

        if (index == -1) {
            System.out.println("Khong tim thay phan tu " + value + " trong mamg.");
        } else {
            System.out.println("Phan tu "+value + " nam tai vi tri index =  " + index + " trong mang.");
        }
    }
}
