package ss14_Debug.thuchanh;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chon phep tinh can thuc hien !");
        System.out.println("1. Thuc hien phep cong (+)");
        System.out.println("2. Thuc hien phep tru (-)");
        System.out.println("3. Thuc hien phep nhan (*)");
        System.out.println("4. Thuc hien phep chia (/)");
        System.out.println("5. Thoat !");

        System.out.println("Moi nhap lua chon cua ban : ");
        int choice = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("Lua chon cua ban khong hop le! ");
            System.out.println("Moi ban nhap lai : ");
            choice = Integer.parseInt(scanner.nextLine());

        } while (choice < 1 || choice > 5);
        switch (choice) {
            case 1:
                System.out.println("Ban da lua chon muc 1 ");
                break;

            case 2:
                System.out.println("Ban da lua chon muc 2");
                break;

            case 3:
                System.out.println("Ban da lua chon muc 3");
                break;

            case 4:
                System.out.println("Ban da lua chon muc 4");
                break;

            case 5:
                System.out.println("Ban da thoat khoi chuong trinh !");
                break;
        }

        System.out.println("Nhap vao gia tri dau tien : ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vao gia tri thu hai : ");
        int y = Integer.parseInt(scanner.nextLine());

        try {
            if (choice == 1) {
                int add = x + y;
                System.out.println("Tong cua gia tri " + x + " + gia tri " + y + " la : " + add);
            }
            if (choice == 2) {
                int sub = x - y;
                System.out.println("Tong cua gia tri " + x + " - gia tri " + y + " la : " + sub);
            }
            if (choice == 3) {
                int mul = x * y;
                System.out.println("Tong cua gia tri " + x + " * gia tri " + y + " la : " + mul);
            }
            if (choice == 4) {
                int div = x / y;
                System.out.println("Tong cua gia tri " + x + " / gia tri " + y + " la : " + div);
            }

        } catch (Exception e) {
            if (x == 0 || y == 0 || x == 0 && y == 0) {
                System.err.println("Truong hop nay khong kha dung !");
            }
        }
    }

    public static boolean isaBoolean() {
        return true;
    }
}