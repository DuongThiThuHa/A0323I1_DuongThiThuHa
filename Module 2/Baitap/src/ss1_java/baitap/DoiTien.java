package ss1_java.baitap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so tien USD : ");
        double usd = scanner.nextDouble();
        double vnd = 23000;
        double doi = usd * 23000;
        System.out.println("Gia tri VND " + doi);
    }
}
