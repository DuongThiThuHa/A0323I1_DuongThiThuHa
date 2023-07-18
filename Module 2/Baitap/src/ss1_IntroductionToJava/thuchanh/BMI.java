package ss1_IntroductionToJava.thuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so can nang hien tai : ");
        double weight = scanner.nextDouble();
        System.out.println("Nhap vao so chieu cao hien tai : ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Chi so BMI hien tai la : "+ bmi);

        if (bmi <= 18.5){
            System.out.println("Underweight");
        } else if (bmi <= 25.0){
            System.out.println("Normal");
        } else if (bmi <= 30.0){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
