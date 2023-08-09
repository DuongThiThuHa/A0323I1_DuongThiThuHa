package service;

import models.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
   private static final Scanner scanner = new Scanner(System.in);
    private static final IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

        public Employee inputInfo(){
            Employee employee = new Employee();
            System.out.println("Enter Employee Code : ");
            employee.setEmployeeCode(scanner.nextLine());
            System.out.println("Enter Name : ");
            employee.setFullName(scanner.nextLine());
            System.out.println("Enter Date Of Birth : ");
            employee.setDateOfBirth(scanner.nextLine());
            System.out.println("Enter Male :");
            employee.setIsMale(scanner.nextLine());
            System.out.println("Enter Identity Card : ");
            employee.setIdentityCard(scanner.nextLine());
            System.out.println("Enter Phone Number : ");
            employee.setPhoneNumber(scanner.nextLine());
            System.out.println("Enter Email : ");
            employee.setEmail(scanner.nextLine());
            System.out.println("Enter Level  : ");
            employee.setLevel(scanner.nextLine());
            System.out.println("Enter Position : ");
            employee.setPosition(scanner.nextLine());
            System.out.println("Enter Salary : ");
            employee.setSalary(Double.parseDouble(scanner.nextLine()));
            return employee;
        }

    @Override
    public void displayEmployee() {
        List<Employee> employeeList = iEmployeeRepository.getAll();
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        Employee employee = inputInfo();
        iEmployeeRepository.add(employee);
        System.out.println("Successfully added new !");
    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void deleteEmployee() {
        System.out.println("Enter employee code : ");
        String id = scanner.nextLine();
        List<Employee> employeeList = iEmployeeRepository.getAll();
        for (Employee employee : employeeList){
            if(id.equals(employee.getEmployeeCode())){
                iEmployeeRepository.delete(id);
            }
        }
        System.out.println("Deleted successfully !");
    }

    @Override
    public void searchEmployee() {
        List<Employee> employeeList = iEmployeeRepository.getAll();
        System.out.println("Enter employee code : ");
        boolean flag = false;
        String id = scanner.nextLine();
        for (Employee employee : employeeList){
            if (id.equals(employee.getEmployeeCode())){
                flag = true;
                System.out.println("Information found!");
                System.out.println("Employee Code : "+employee.getEmployeeCode()+ "Name : "+ employee.getFullName()+ "Date of birth : "+employee.getDateOfBirth()+ " Is Male : " + employee.getDateOfBirth() + "Identity Card : "+ employee.getIdentityCard()+ "Phone Number : "+ employee.getPhoneNumber() + " Email :" + employee.getEmail()+ " Level : "+ employee.getLevel() + " Position : "+ employee.getPosition()+ " Salary : "+ employee
                        .getSalary());
                break;
            }
        }
        if (!flag){
            System.out.println("Not found code "+ id);
        }
    }
}
