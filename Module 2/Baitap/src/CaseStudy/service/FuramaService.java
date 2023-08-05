package CaseStudy.service;

import CaseStudy.model.House;

import java.util.Scanner;

public class FuramaService {
    public static void main(String[] args) {
        House house = new House();
        house.setType(choiceFreeService());
    }
    public static String choiceFreeService(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Free Service");
        System.out.println("1.Year");
        System.out.println("2.Month");
        System.out.println("3.Day");
        System.out.println("4.Hour");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                return "Year";
            case 2:
                return "Month";
            case 3:
                return "Day";
            case 4:
                return "Hour";
            default:
                return "";
        }

    }
}
