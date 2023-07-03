package ss8_MVC.mvc.service.impl;

import ss8_MVC.mvc.model.Student;
import ss8_MVC.mvc.service.IStudentService;

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
