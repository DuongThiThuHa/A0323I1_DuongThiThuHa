package ss16.mvc.service.impl;


import ss16.mvc.model.Student;
import ss16.mvc.repository.IStudentRepository;
import ss16.mvc.repository.impl.StudentRepository;
import ss16.mvc.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner = new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        Student student = inputInfo();
        iStudentRepository.add(student);
        System.out.println("Thêm mới thành công !");
        System.out.println("---------------------------------");
    }

    @Override
    public void searchStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        System.out.println("Nhập mã cần tìm kiếm : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : studentList) {
            while (id == student.getCode()) {
                System.out.println("Đã tìm thấy thông tin theo mã !");
                System.out.println("Ma : " + student.getCode() + " , Tên: " + student.getName() + " , Ngày sinh : " + student.getDateOfBirth() + " , Điểm : " + student.getGrade());
                break;
            }
            while (id != student.getCode()){
                System.out.println("Không tìm thấy mã !");
                break;
            }
        }
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Nhập code để xóa: ");
        int code = Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);
        System.out.println("Đã xóa thành công !");

    }

    public Student inputInfo() {
        Student student = new Student();
        System.out.print("Nhập mã: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh: ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập điểm: ");
        student.setGrade(Double.parseDouble(scanner.nextLine()));
        return student;
    }
}
