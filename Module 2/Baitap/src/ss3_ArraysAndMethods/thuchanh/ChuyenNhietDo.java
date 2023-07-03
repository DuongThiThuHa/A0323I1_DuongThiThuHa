package ss3_ArraysAndMethods.thuchanh;

import java.util.Scanner;

public class ChuyenNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int chuyen;

        do {
            System.out.println("Menu");
            System.out.println("1.Do F sang do C");
            System.out.println("2.Do C sang do F");
            System.out.println("3.Exit");
            System.out.println("Moi chon so trong menu");
            chuyen = input.nextInt();

            switch (chuyen) {
                case 1: {
                    System.out.println("Nhap do F");
                    doF = input.nextDouble();
                    System.out.println("Do F chuyen sang do C " + chuyenDoFSangC(doF));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C");
                    doC = input.nextDouble();
                    System.out.println("Do C chuyen sang do F " + chuyenDoCSangF(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (chuyen != 0);
    }

    public static double chuyenDoFSangC(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double chuyenDoCSangF(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
