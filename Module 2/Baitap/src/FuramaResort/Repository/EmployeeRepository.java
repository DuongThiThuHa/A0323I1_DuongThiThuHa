package FuramaResort.Repository;

import FuramaResort.Data.ReadWriteFile;
import FuramaResort.Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeRepository implements IEmployeeRepository{
public static final String SRC_EMPLOYEE = "src/FuramaResort/Data/Data.csv";

    //Chức năng thêm nhân viên
    public void add(Employee employee){
        ReadWriteFile.WriteFile(SRC_EMPLOYEE,convertToString(employee),true);
    }

    private String convertToString(Employee employee){
        return employee.getCode() + " , "+employee.getName() + " , "+ employee.getDateOfBirth() + " , "+employee.getPosition() + " , "+employee.getSalary()+ " , ";
    }

    //Chức năng xóa nhân viên
    public void remove(int code){
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getCode() == code){
                System.out.println("Bạn có muốn xóa nhân viên này không ?");
                System.out.println("1.Có");
                System.out.println("2.Không");
            }
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                boolean remove = employeeList.remove(employee);
                String string = "";
                for (Employee temp : employeeList){
                    string = string + convertToString(temp) + "\n";
                }
                string = string.substring(0,string.length()-3);
                ReadWriteFile.WriteFile(SRC_EMPLOYEE,string,false);
                System.out.println("Xóa thành công !");
            }
            break;
        }
    }

    //Chức năng hiển thị danh sách
    public List<Employee> getAll(){
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadWriteFile.ReadFile(SRC_EMPLOYEE);

        String[] temp;
        for (String string : stringList){
            temp = string.split(" , " );
            employeeList.add(new Employee(new String(temp[0]),temp[1],temp[3],Integer.parseInt(temp[4]), temp[5], Double.parseDouble(temp[6])));
        }
        return employeeList;
    }

    //Chức năng tìm kiếm nhân cuên

}
