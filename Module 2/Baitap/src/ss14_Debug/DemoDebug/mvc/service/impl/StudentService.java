package ss14_Debug.DemoDebug.mvc.service.impl;


import ss14_Debug.DemoDebug.mvc.model.Student;
import ss14_Debug.DemoDebug.mvc.repository.IStudentRepository;
import ss14_Debug.DemoDebug.mvc.service.IStudentService;
import ss14_Debug.DemoDebug.mvc.repository.impl.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private final Scanner scanner= new Scanner(System.in);
    private static final IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void addStudent() {
        Student student = inputInfo();
        iStudentRepository.add(student);
        System.out.println("Thêm mới thành công");
        System.out.println("---------------------------------");
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        for(Student student: studentList) {
            System.out.println(student);
        }
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
