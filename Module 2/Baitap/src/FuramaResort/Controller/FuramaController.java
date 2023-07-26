package FuramaResort.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController extends Exception {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int choose = 0;

        try {
            while (choice != 6) {
                System.out.println("-Menu Resort-");
                System.out.println("1.Employee Management");
                System.out.println("2.Customer Management");
                System.out.println("3.Facility Management");
                System.out.println("4.Booking Management");
                System.out.println("5.Promotion Management");
                System.out.println("6.Exit");

                System.out.println("\nPlease select the menu: ");
                choice = Integer.parseInt(scanner.nextLine());


                //Menu 1: Employee Management
                System.out.println("\nYou have selected item number 1 in the menu ! ");
                System.out.println("\nFunction list of Employee Management: ");
                System.out.println("1.Display list employees");
                System.out.println("2.Add new employees");
                System.out.println("3.Edit employees");
                System.out.println("4.Delete employees");
                System.out.println("6.Return main menu");


                System.out.println("\n Please select the function you want to perform : ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose >= 1 && choose <= 6) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have selected the function display list employees");
                                    break;
                                case 2:
                                    System.out.println("You have selected the function add new employees");
                                    break;
                                case 3:
                                    System.out.println("You have selected the function edit employees");
                                    break;
                                case 4:
                                    System.out.println("You have selected the function delete employees");
                                    break;
                                case 5:
                                    System.out.println("You have selected the function search by name employees");
                                    break;
                                case 6:
                                    System.out.println("You have selected the function return main menu");
                                    break;
                            }
                        }
                }

                //Menu 2: Customer Management
                System.out.println("\nYou have selected item number 2 in the menu ! ");
                System.out.println("\nFunction list of Customer Management : ");
                System.out.println("1.Display list customer");
                System.out.println("2.Add new customer");
                System.out.println("3.Edit customer");
                System.out.println("4.Delete customer");
                System.out.println("6.Return main menu");


                System.out.println("\n Please select the function you want to perform : ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose >= 1 && choose <= 6) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have selected the function display list customer");
                                    break;
                                case 2:
                                    System.out.println("You have selected the function add new customer");
                                    break;
                                case 3:
                                    System.out.println("You have selected the function edit customer");
                                    break;
                                case 4:
                                    System.out.println("You have selected the function delete customer");
                                    break;
                                case 5:
                                    System.out.println("You have selected the function search by name customer");
                                    break;
                                case 6:
                                    System.out.println("You have selected the function return main menu");
                                    break;
                            }
                        }
                }


                //Menu 3: Facility Management
                System.out.println("\nYou have selected item number 3 in the menu ! ");
                System.out.println("\nFunction list of Facility Management  : ");
                System.out.println("1.Display list facility");
                System.out.println("2.Add new facility");
                System.out.println("3.Display list facility maintenance");
                System.out.println("4.Delete facility");
                System.out.println("6.Return main menu");

                System.out.println("\n Please select the function you want to perform : ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose >= 1 && choose <= 5) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have selected the function display list facility");
                                    break;
                                case 2:
                                    System.out.println("You have selected the function add new facility");
                                    break;
                                case 3:
                                    System.out.println("You have selected the function display list facility maintenance");
                                    break;
                                case 4:
                                    System.out.println("You have selected the function delete facility");
                                    break;
                                case 5:
                                    System.out.println("You have selected the function return main menu");
                                    break;
                            }
                        }
                    default:
                }


                //Menu 2: Booking Managerment
                System.out.println("\nYou have selected item number 4 in the menu ! ");
                System.out.println("\nFunction list of Booking Managerment : ");
                System.out.println("1.Display list customer");
                System.out.println("2.Add new customer");
                System.out.println("3.Edit customer");
                System.out.println("4.Delete customer");
                System.out.println("6.Return main menu");


                System.out.println("\n Please select the function you want to perform : ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose >= 1 && choose <= 6) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have selected the function display list booking");
                                    break;
                                case 2:
                                    System.out.println("You have selected the function add new booking");
                                    break;
                                case 3:
                                    System.out.println("You have selected the function create new contracts");
                                    break;
                                case 4:
                                    System.out.println("You have selected the function display list contracts");
                                    break;
                                case 5:
                                    System.out.println("You have selected the function edit contracts");
                                    break;
                                case 6:
                                    System.out.println("You have selected the function return main menu");
                                    break;
                            }
                        }
                    default:
                }


                //Menu 3: Promotion  Management
                System.out.println("\nYou have selected item number 5 in the menu ! ");
                System.out.println("\nFunction list of Promotion  Management  : ");
                System.out.println("1.Display list customer use service");
                System.out.println("2.Display list customer get voucher");
                System.out.println("3.Return main menu");

                System.out.println("\n Please select the function you want to perform : ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose >= 1 && choose <= 3) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have selected the function display list customer use service");
                                    break;
                                case 2:
                                    System.out.println("You have selected the function display list customer get voucher");
                                    break;
                                case 3:
                                    System.out.println("You have selected the function return main menu");
                                    break;
                            }
                        }
                    default:
                }

                System.out.println("\nYou have selected item number 6 in the menu ! ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        if (choose == 1) {
                            switch (choose) {
                                case 1:
                                    System.out.println("You have chosen to end the program !");
                                    break;
                            }
                        }
                    default:
                }
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a number!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number!");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        scanner.close();

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
