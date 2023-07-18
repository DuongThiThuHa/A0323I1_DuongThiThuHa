package ss10_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayWithStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so luong phan tu co trong mang: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + i + " vao mang");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mang truoc khi dao nguoc: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseArray(array);

        System.out.println("\n Mang sau khi dao nguoc: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
