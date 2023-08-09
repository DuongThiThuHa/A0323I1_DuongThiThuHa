package controllers;

import service.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("---Menu---");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit ");
            System.out.println("----------");
            int choose = 0;

            try {
                System.out.println("Enter choose (1 -> 6) : ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error wrong format !");
            }
            switch (choose) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Return menu !");
            }
        }
    }

    public static void displayEmployeeManagement() {
        EmployeeService employeeService = new EmployeeService();
        int choose = 0;
        while (true) {
            System.out.println("---Menu Employee Management---");
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tDelete employee");
            System.out.println("5\tSearch by name employee");
            System.out.println("6\tReturn main menu ");
            System.out.println("-----------");
            try {
                System.out.println("Enter choose (1 -> 6) : ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error wrong format !");
            }

            switch (choose) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.deleteEmployee();
                    break;
                case 5:
                    employeeService.searchEmployee();
                    break;
                case 6:
                    System.out.println("Return main menu !");
                    return;
            }
        }
    }


        public static void displayCustomerManagement () {
            CustomerService customerService = new CustomerService();
            while (true) {
                System.out.println("---Menu Customer Management---");
                System.out.println("1.\tDisplay list customers");
                System.out.println("2.\tAdd new customer");
                System.out.println("3.\tEdit customer");
                System.out.println("4.\tDelete customer");
                System.out.println("5.\tSearch by name customer");
                System.out.println("6.\tReturn main menu");
                System.out.println("---------");
                int choose = 0;
                try {
                    System.out.println("Enter choose ( 1-> 6) :");
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error wrong format !");
                }
                switch (choose) {
                    case 1:
                        customerService.displayCustomer();
                        break;
                    case 2:
                        customerService.addCustomer();
                        break;
                    case 3:
                        customerService.editCustomer();
                        break;
                    case 4:
                        customerService.deleteCustomer();
                        break;
                    case 5:
                        customerService.searchCustomer();
                        break;
                    case 6:
                        System.out.println("Return main menu ! ");
                        return;
                }
            }
        }

        public static void displayFacilityManagement () {
            FacilityService facilityService = new FacilityService();
            while (true) {
                System.out.println("---Menu Facility Management---");
                System.out.println("1.\tDisplay list facility");
                System.out.println("2.\tAdd new facility");
                System.out.println("3.\tDisplay list facility maintenance");
                System.out.println("4.\tDelete facility");
                System.out.println("5.\tReturn main menu");
                System.out.println("---------");
                int choose = 0;
                try {
                    System.out.println("Enter choose ( 1 -> 5) :");
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error wrong format !");
                }
                switch (choose) {
                    case 1:
                        facilityService.displayFacility();
                        break;
                    case 2:
                        facilityService.addFacility();
                        break;
                    case 3:
                        facilityService.displayFacilityManagement();
                        break;
                    case 4:
                        facilityService.deleteFacility();
                        break;
                    case 5:
                        System.out.println("Return main menu ! ");
                        return;
                }
            }
        }

        public static void displayBookingManagement () {
            BookingService bookingService = new BookingService();
            while (true) {
                System.out.println("---Menu Booking Management---");
                System.out.println("2.\tDisplay list booking");
                System.out.println("2.\tAdd new booking");
                System.out.println("3.\tCreate new contracts");
                System.out.println("4.\tCreate new contracts");
                System.out.println("5.\tEdit contracts");
                System.out.println("6.\tReturn main menu");
                System.out.println("---------");
                int choose = 0;
                try {
                    System.out.println("Enter choose ( 1-> 6) :");
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error wrong format !");
                }
                switch (choose) {
                    case 1:
                        bookingService.displayBooking();
                        break;
                    case 2:
                        bookingService.addBooking();
                        break;
                    case 3:
                        bookingService.createBooking();
                        break;
                    case 4:
                        bookingService.displayContact();
                        break;
                    case 5:
                        bookingService.editContact();
                        break;
                    case 6:
                        System.out.println("Return main menu ! ");
                        return;
                }
            }
        }


        public static void displayPromotionManagement () {
            PromotionService promotionService = new PromotionService();

            while (true) {
                System.out.println("---Menu Promotion Management---");
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                System.out.println("---------");
                int choose = 0;
                try {
                    System.out.println("Enter choose ( 1-> 3) :");
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error wrong format !");
                }
                switch (choose) {
                    case 1:
                        promotionService.displayService();
                        break;
                    case 2:
                        promotionService.displayVoucher();
                        break;
                    case 3:
                        System.out.println("Return main menu ! ");
                        return;
                }
            }
        }
    }



