package ss14_Debug.DemoDebug.mvc.controller;

import ss14_Debug.DemoDebug.mvc.service.IStudentService;
import ss14_Debug.DemoDebug.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static final IStudentService iStudentService = new StudentService();
    private static final Scanner scanner = new Scanner(System.in);
    public static void menu() {
        while (true) {
            System.out.println("1. Thêm mới");
            System.out.println("2. Chỉnh sửa");
            System.out.println("3. Hiển thị danh sách");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng");
            }

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
