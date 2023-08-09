package ss16.mvc.service.impl;

import ss16.mvc.model.Teacher;
import ss16.mvc.repository.ITeacherRepository;
import ss16.mvc.repository.impl.TeacherRepository;
import ss16.mvc.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherRepository iTeacherRepository = new TeacherRepository();


    public Teacher inputInfo() {
        Teacher teacher = new Teacher();
        System.out.println("Nhập mã giáo viên : ");
        teacher.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên giáo viên : ");
        teacher.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh giáo viên : ");
        teacher.setDateOfBirth(scanner.nextLine());
        System.out.println("Nhập vị trí giảng dạy : ");
        teacher.setPosition(scanner.nextLine());
        System.out.println("Nhập tiền lương cho giáo viên : ");
        teacher.setSalary(Double.parseDouble(scanner.nextLine()));
        return teacher;
    }


    @Override
    public void addTeacher() {
        Teacher teacher = inputInfo();
        iTeacherRepository.add(teacher);
        System.out.println("Thêm mới giáo viên thành công ! ");
        System.out.println("-------");
    }

    @Override
    public void searchTeacher() {
        List<Teacher> teacherList = iTeacherRepository.getAll();
        System.out.println("Nhập mã giáo viên cần tìm kiếm : ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        Teacher teacherChange = new Teacher();
        for (Teacher teacher : teacherList) {
            if (id == teacher.getCode()) {
                teacherChange = teacher;
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Tìm thấy thông tin của giáo viên có mã " + id);
            System.out.println(teacherChange.toString());
            System.out.println("-----------");
        } else {
            System.out.println("Không tìm thấy thông giáo viên có mã : " + id);
            System.out.println("-----------");
        }
    }

    @Override
    public void displayTeacher() {
        List<Teacher> teacherList = iTeacherRepository.getAll();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void deleteTeacher() {
        System.out.println("Nhập mã code giáo viên cần xóa : ");
        int code = Integer.parseInt(scanner.nextLine());
        iTeacherRepository.remove(code);
        System.out.println("Đã xóa thành công ! ");
        System.out.println("------------");
    }
}
