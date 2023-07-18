package ss8_Cleancode_Refactoring.MVC.mvc.controller;

import ss8_Cleancode_Refactoring.MVC.mvc.service.IStudentService;
import ss8_Cleancode_Refactoring.MVC.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static final IStudentService iStudentService = new StudentService();
    private static final Scanner scanner = new Scanner(System.in);
    public static void menu() {
        while (true) {
            System.out.println("1. Thêm mới");
            System.out.println("2. Chỉnh sửa");
            System.out.println("3. Hển thị danh sách");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)  {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
            }
        }
    }
}
