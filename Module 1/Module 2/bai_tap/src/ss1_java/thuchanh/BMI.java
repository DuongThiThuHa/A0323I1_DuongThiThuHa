package ss1_java.thuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi, weight, height ;

        System.out.println("Nhap vao so can nang hien tai cua ban : ");
        weight = scanner.nextDouble();

        System.out.println("Nhap vao chieu cao hien tai cua ban : ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
