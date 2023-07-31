package ss8.mvc.service.impl;

import ss8.mvc.model.Student;
import ss8.mvc.service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public void addStudent() {
        Student student = inputInfo();
    }

    public Student inputInfo() {
        Student student = new Student();
//        ... Nhập thông tin
        return student;
    }
}
