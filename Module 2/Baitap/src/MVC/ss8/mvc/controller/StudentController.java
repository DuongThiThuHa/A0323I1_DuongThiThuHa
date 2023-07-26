package ss8.mvc.controller;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        System.out.println("1. Thêm mới");
        System.out.println("2. Chỉnh sửa");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice)  {
            case 1:
                break;
        }
    }
}
