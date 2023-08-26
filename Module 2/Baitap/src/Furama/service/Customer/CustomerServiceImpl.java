package Furama.service.Customer;

import Furama.model.Customer;
import Furama.until.ReadAndWriteCustomer;
import Furama.until.RegexPerson;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static LinkedList<Customer> list = new LinkedList<>();

    //    static {
//        list.add(new Customer("1", "Hi",23,"Nam", "Đà Nẵng",123,"abc@gmail.com","Diamond"));
//        list.add(new Customer("2", "A",20,"Nam", "Hà Nội",123,"ab1@gmail.com","Platinium"));
//        list.add(new Customer("3", "B",19,"Nam", "TP HCM",123,"ab2@gmail.com","Gold"));
//        list.add(new Customer("4", "C",17,"Nam", "Quảng Nam",123,"ab3@gmail.com","Silver"));
//        list.add(new Customer("5", "D",18, "Nam","Huế",123,"ab4@gmail.com","Member"));
//
//    }
    @Override
    public void display() {
        try {
            list = (LinkedList<Customer>) ReadAndWriteCustomer.readCSV();
            for (Customer customer : list) {
                System.out.println(customer);

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
        //đọc
        try {
            list = (LinkedList<Customer>) ReadAndWriteCustomer.readCSV();
            for (Customer customer : list) {
                System.out.println(customer);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // nhập
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = input.nextLine();
        String name = RegexPerson.name();
        LocalDate age = RegexPerson.age();
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
        //loại khách
        String tyle = null;
        System.out.println(" loại: ");
        System.out.println("1.Diamond");
        System.out.println("2.Platinium");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        do {
            System.out.println("Chọn loại: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    tyle = "Diamond";
                    break;
                case 2:
                    tyle = "Platinium";
                    break;
                case 3:
                    tyle = "Gold";
                    break;
                case 4:
                    tyle = "Silver";
                    break;
                case 5:
                    tyle = "Member";
                    break;
            }
        } while (choose < 1 || choose > 5);
        Customer customer = new Customer(id, name, age, sex, address, idCard, email, tyle);
        list.add(customer);
        //write
        try {
            ReadAndWriteCustomer.writeCSV(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        display();

    }

    @Override
    public void edit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào id cần sửa thông tin");
        String inputId = input.nextLine();
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(inputId)) {
                check = true;
                String name = RegexPerson.name();
                LocalDate age = RegexPerson.age();
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
                //loại khách
                String tyle = null;
                System.out.println(" loại: ");
                System.out.println("1.Diamond");
                System.out.println("2.Platinium");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                do {
                    System.out.println("Chọn loại: ");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            tyle = "Diamond";
                            break;
                        case 2:
                            tyle = "Platinium";
                            break;
                        case 3:
                            tyle = "Gold";
                            break;
                        case 4:
                            tyle = "Silver";
                            break;
                        case 5:
                            tyle = "Member";
                            break;
                    }
                } while (choose < 1 || choose > 5);
                Customer customer = new Customer(inputId, name, age, sex, address, idCard, email, tyle);
                list.set(i, new Customer(inputId, name, age, sex, address, idCard, email, tyle));
                try {
                    ReadAndWriteCustomer.writeCSV(list);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                display();

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void delete() {

    }
}
