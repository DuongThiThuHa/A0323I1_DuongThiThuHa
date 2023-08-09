package ss16.mvc.service.impl;


import ss16.mvc.model.Student;
import ss16.mvc.repository.IStudentRepository;
import ss16.mvc.repository.impl.StudentRepository;
import ss16.mvc.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner = new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        Student student = inputInfo();
        iStudentRepository.add(student);
        System.out.println("Thêm mới học sinh thành công !");
        System.out.println("--------");
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void searchStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        System.out.println("Nhập mã code học sinh : ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        Student studentChange = new Student(); //Biến tạm
        for (Student student : studentList) {
            if (id == student.getCode()) {
                studentChange = student;
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Tìm thấy thông tin học sinh có mã : " + id);
            System.out.println(studentChange.toString());
        } else {
            System.out.println("Không tìm thấy học sinh có mã :" + id);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Nhập code để xóa: ");
        int code = Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);

    }

    public Student inputInfo() {
        Student student = new Student();
        System.out.print("Nhập mã học sinh : ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên học sinh : ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh học sinh : ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập điểm học sinh : ");
        student.setGrade(Double.parseDouble(scanner.nextLine()));
        return student;
    }
}
