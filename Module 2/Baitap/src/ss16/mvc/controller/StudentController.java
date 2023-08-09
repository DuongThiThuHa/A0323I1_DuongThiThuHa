package ss16.mvc.controller;

import ss16.mvc.service.IStudentService;
import ss16.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        while (true) {
            System.out.println("---Chức năng của học sinh---");
            System.out.println("1. Thêm mới học sinh ");
            System.out.println("2. Tìm kiếm học sinh ");
            System.out.println("3. Hiển thị danh sách học sinh ");
            System.out.println("4. Xóa học sinh ");
            int choice = 0;
            try {
                System.out.println("Mời chọn chức năng (1 -> 4) : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng !");
            }

            switch (choice)  {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.searchStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.removeStudent();
                    break;
            }
        }
    }
}
