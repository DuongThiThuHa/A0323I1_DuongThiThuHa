package FuramaResort.Service;

import FuramaResort.Model.Employee;
import FuramaResort.Repository.EmployeeRepository;
import FuramaResort.Repository.IEmployeeRepository;
import org.hamcrest.core.IsCollectionContaining;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();


    public Employee inputInfo(){
        Employee employee = new Employee();
        System.out.println("Nhập mã : ");
        employee.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên : ");
        employee.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh :");
        employee.setDateOfBirth(scanner.nextLine());
        System.out.println("Nhập chức vụ : ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Nhập tiền louowgn: ");
        employee.setSalary(Integer.parseInt(scanner.nextLine()));
        return employee;
    }


    public void addEmployee(){
        Employee employee = inputInfo();
        iEmployeeRepository.add(employee);
        System.out.println("Thêm mới thành công ! ");
        System.out.println("----------------------");
    }


}
