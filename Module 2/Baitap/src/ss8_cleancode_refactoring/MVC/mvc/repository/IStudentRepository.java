package ss8_Cleancode_Refactoring.MVC.mvc.repository;

import ss8_Cleancode_Refactoring.MVC.mvc.model.Student;

import java.util.List;

public interface IStudentRepository {

    void removeStudent(Student student);

    void addStudent(Student student);

    List<Student> getAll();
}
