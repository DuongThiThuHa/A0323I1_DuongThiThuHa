package ss16.mvc.controller;

import ss16.mvc.service.ITeacherService;
import ss16.mvc.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        while (true){
            System.out.println("---Chức năng của giáo viên---");
            System.out.println("1. Thêm mới giáo viên ");
            System.out.println("2. Tìm kiếm giáo viên ");
            System.out.println("3. Hiển thị danh sách giáo viên ");
            System.out.println("4. Xóa giáo viên ");
            int choose = 0;
            try{
                System.out.println("Mời chọn chức năng (1 -> 4) : ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Nhập định dạn không đúng !");
            }

            switch (choose){
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.searchTeacher();
                    break;
                case 3:
                    iTeacherService.displayTeacher();
                    break;
                case 4:
                    iTeacherService.deleteTeacher();
                    break;
            }

        }
    }
}
