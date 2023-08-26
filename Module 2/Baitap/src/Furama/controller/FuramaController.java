package Furama.controller;

import Furama.service.Customer.CustomerServiceImpl;
import Furama.service.Employee.EmployeeServiceImpl;
import Furama.service.Facility.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) throws IOException {
        displayMainMenu();

    }

    public static void displayMainMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Nhập số để chọn chức năng trên menu: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                case 2:
                    displayCustomerMenu();
                case 3:
                    displayFacilityMenu();
                case 4:
                    System.out.println("1 Add new booking");
                    System.out.println("2 Display list booking");
                    System.out.println("3 Create new constracts");
                    System.out.println("4 Display list contracts");
                    System.out.println("5 Edit contracts");
                    System.out.println("6 Return main menu");
                    break;
                case 5:
                    System.out.println("1 Display list customers use service");
                    System.out.println("2 Display list customers get voucher");
                    System.out.println("3 Return main menu");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn số trên menu");

            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }

    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1 Display list customers");
            System.out.println("2 Add new customer");
            System.out.println("3 Edit customer");
            System.out.println("4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.edit();
                    break;
                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void displayFacilityMenu() throws IOException {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1 Display list facility");
            System.out.println("2 Add new facility");
            System.out.println("3 Display list facility maintenance");
            System.out.println("4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.display();
                }
                case 2: {
                    facilityService.addNew();
                }
                case 3: {
                    facilityService.edit();

                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }

    }
}
