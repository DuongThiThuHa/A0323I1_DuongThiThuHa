package Furama.service.Employee;

import Furama.model.Employee;
import Furama.until.ReadAndWriteEmployee;
import Furama.until.RegexPerson;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> list = new ArrayList<>();

//    static {
//        list.add(new Employee("1", "Phuc", 21,"nam","Đà Nẵng",001,"phuc@gmail.com","Quản lí","10000000","Giám đốc"));
//        list.add(new Employee("2", "A", 20,"nam","Hà Nội",002,"a@gmail.com","Quản lí","5000000","Phó giám đốc"));
//        list.add(new Employee("3", "B", 22,"nam","Bình Dương",003,"b@gmail.com","Quản lí","7000000","Trưởng phòng"));
//        list.add(new Employee("4", "C", 23,"nam","Quảng Nam",004,"c@gmail.com","Quản lí","8000000","Phó trường phòng"));
//    }

    @Override
    public void display() {
        try {
            list = ReadAndWriteEmployee.readCSV();
            for (Employee employee : list) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for (int i =0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }

    @Override
    public void addNew() {
        //read
        try {
            list = ReadAndWriteEmployee.readCSV();
            for (Employee employee : list) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //nhập
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = input.nextLine();
        String name = RegexPerson.name();
        LocalDate age = RegexPerson.age();
        // chọn giới tính
        System.out.println("Chọn giới tính");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        String sex = null;
        int choose;
        do {
            System.out.println("Chọn giới tính:");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "Nữ";
                    break;
            }
        } while (choose < 1 || choose > 2);
        System.out.println("Nhập địa chỉ");
        String address = input.nextLine();
        String idCard = RegexPerson.idCard();
        String email = RegexPerson.email();
        // trình độ
        String level = null;
        System.out.println("Trình độ: ");
        System.out.println("1.Trung cấp");
        System.out.println("2.Cao đẳng");
        System.out.println("3.Đại học");
        System.out.println("4.Sau đại học");
        do {
            System.out.println("Chọn trình độ:");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao đẳng";
                    break;
                case 3:
                    level = "Đại học";
                    break;
                case 4:
                    level = "Sau đại học";
                    break;
            }

        } while (choose < 1 || choose > 4);
        double salary = RegexPerson.salary();
        // chức vụ
        String position = null;
        System.out.println("Chức vụ: ");
        System.out.println("1.Lễ Tân");
        System.out.println("2.Phục vụ");
        System.out.println("3.Chuyên viên");
        System.out.println("4.Giám sát");
        System.out.println("5.Quản lý");
        System.out.println("6.Giám đốc");
        do {
            System.out.println("Chọn chức vụ: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Phục vụ";
                    break;
                case 3:
                    position = "Chuyên viên";
                    break;
                case 4:
                    position = "Giám sát";
                    break;
                case 5:
                    position = "Quản lý";
                    break;
                case 6:
                    position = "Giám đốc";
                    break;
            }
        } while (choose < 1 || choose > 6);

        Employee employee = new Employee(id, name, age, sex, address, idCard, email, level, salary, position);
        list.add(employee);
        //write
        try {
            ReadAndWriteEmployee.writeCSV(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        display();
    }

    @Override
    public void edit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào id cần sửa thông tin: ");
        String inputID = input.nextLine();// tìm id
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(inputID)) {
                check = true;
                String name = RegexPerson.name();
                LocalDate age = RegexPerson.age();
                // chọn giới tính
                System.out.println("Chọn giới tính");
                System.out.println("1.Nam");
                System.out.println("2.Nữ");
                String sex = null;
                int choose;
                do {
                    System.out.println("Chọn giới tính:");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            sex = "Nam";
                            break;
                        case 2:
                            sex = "Nữ";
                            break;
                    }
                } while (choose < 1 || choose > 2);
                System.out.println("Nhập địa chỉ");
                String address = input.nextLine();
                String idCard = RegexPerson.idCard();
                String email = RegexPerson.email();
                // trình độ
                String level = null;
                System.out.println("Trình độ: ");
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau đại học");
                do {
                    System.out.println("Chọn trình độ:");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            level = "Trung cấp";
                            break;
                        case 2:
                            level = "Cao đẳng";
                            break;
                        case 3:
                            level = "Đại học";
                            break;
                        case 4:
                            level = "Sau đại học";
                            break;
                    }

                } while (choose < 1 || choose > 4);
                double salary = RegexPerson.salary();
                // chức vụ
                String position = null;
                System.out.println("Chức vụ: ");
                System.out.println("1.Lễ Tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                do {
                    System.out.println("Chọn chức vụ: ");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            position = "Lễ tân";
                            break;
                        case 2:
                            position = "Phục vụ";
                            break;
                        case 3:
                            position = "Chuyên viên";
                            break;
                        case 4:
                            position = "Giám sát";
                            break;
                        case 5:
                            position = "Quản lý";
                            break;
                        case 6:
                            position = "Giám đốc";
                            break;
                    }
                } while (choose < 1 || choose > 6);
                list.set(i, new Employee(inputID, name, age, sex, address, idCard, email, level, salary, position));
                try {
                    ReadAndWriteEmployee.writeCSV(list);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                display();
            }
        }
        if (!check) {
            System.out.println("ko tìm thấy id");
        }


    }

    @Override
    public void delete() {

    }
}
