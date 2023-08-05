package CaseStudy.service;

import CaseStudy.model.Employee;

import java.util.Scanner;

public class EmployeeService {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDegree(choiceDegree());
        employee.setPosition(choicePosition());
    }

    public static String choiceDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Level Information : ");
        System.out.println("1.Intermediate : ");
        System.out.println("2.College : ");
        System.out.println("3.University : ");
        System.out.println("4.Postgraduate : ");
        int choice = 0;
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Intermediate";
            case 2:
               return "College";
            case 3:
                return "University";
            case 4:
                return "Postgraduate";
        }
        return "";
    }


    public static String choicePosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Level Position : ");
        System.out.println("1.Reception\n");
        System.out.println("2.Serve\n");
        System.out.println("3.Expert\n");
        System.out.println("4.Supervise\n");
        System.out.println("5.Administer\n");
        System.out.println("6.Director\n");

        int choice = 0;
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Reception";
            case 2:
               return "Serve";
            case 3:
               return "Expert";
            case 4:
                return "Supervise";
            case 5:
                return "Administer";
            case 6:
                return "Expert";
            default:
                return "Director";
        }
    }
}
