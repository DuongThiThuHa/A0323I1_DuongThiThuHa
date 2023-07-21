package ss12_SearchAlgorithm.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ki tu bat ki : ");
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
        int ascii;
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("Chuoi ki tu sau khi duoc sap xep tu be den lon : "+ sorted);
    }
}
