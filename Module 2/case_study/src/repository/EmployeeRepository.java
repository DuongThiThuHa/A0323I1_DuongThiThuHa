package repository;

import data.ReadWriteFile;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository{
    Scanner scanner = new Scanner(System.in);
    public static final String SRC_EMPLOYEE = "src/data/Employee.csv ";
    @Override
    public void display(Employee employee) {

    }

    @Override
    public void add(Employee employee) {
        ReadWriteFile.writeFile(SRC_EMPLOYEE,convertToString(employee),true);
    }

    @Override
    public void search(Employee employee) {

    }

    @Override
    public void delete(String employee) {
        String code = " ";
        List<Employee> employeeList = getAll();
        for (Employee employee1 : employeeList){
            if (employee1.getEmployeeCode() == code){
                System.out.println("Do you want to delete the employee with this code "+ code+ " ? ");
                System.out.println("1.Yes ");
                System.out.println("2.No ");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1){
                    boolean delete = employeeList.remove(employee);
                    String string = " ";
                    for (Employee employee2 : employeeList){
                        string = string + convertToString(employee2);
                    }
                    string =string.substring(0,string.length()-3);
                    ReadWriteFile.writeFile(SRC_EMPLOYEE,string,false);
                    System.out.println("Delete successfully !");
                }
                break;
            }
        }
        employeeList.remove(employee);
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadWriteFile.readFile(SRC_EMPLOYEE);
        String[] temp;
        for (String string : stringList){
            temp = string.split(" , ");
            employeeList.add(new Employee(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9],temp[10],temp[11], Double.parseDouble(temp[12])) );
        }
        return employeeList;
    }

    private String convertToString(Employee employee){
        return employee.getEmployeeCode()+ " , "+employee.getFullName()+" , "+ employee.getDateOfBirth()+ " , "+ employee.getEmail()+" , "+ employee.getIdentityCard()+ " , "+ employee.getIsMale()+ " , "+ employee.getLevel()+ " , "+ employee.getPhoneNumber()+ " , "+ employee.getPosition()+ " , "+ employee.getSalary();
    }
}
