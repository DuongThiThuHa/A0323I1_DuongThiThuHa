package ss3_ArraysAndMethods.baitap;

import java.util.Scanner;

public class KyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chuoi;
        int count = 0;
        System.out.println("Nhap vao 1 chuoi ki tu bat ki: ");
        chuoi = scanner.nextLine();

        System.out.println("Nhap vao 1 ki tu bat ki muon kiem tra : ");
        char kyTu = scanner.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)){
                count++;
            }
        }
        System.out.println("So ki tu xuat hien trong chuoi la "+ count);
    }
}
