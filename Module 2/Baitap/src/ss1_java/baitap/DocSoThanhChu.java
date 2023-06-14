package ss1_java.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao 1 so bat ky : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 <= 10){
            switch (number1){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if ( number2 < 20){
            switch (number2){
                case 0 :
                    System.out.println("Eleven");
                    break;
                case 1:
                    System.out.println("Twelve");
                    break;
                case 2:
                    System.out.println("Thirteen");
                    break;
                case 3 :
                    System.out.println("Fourteen");
                    break;
                case 4:
                    System.out.println("Fifteen");
                    break;
                case 5:
                    System.out.println("Sixteen");
                    break;
                case 6:
                    System.out.println("Seventeen");
                    break;
                case 7:
                    System.out.println("Eighteen");
                    break;
                case 8:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number3 < 100){
            switch (number3){
                case 1:
                    System.out.print("Twenty");
                    break;
                case 2:
                    System.out.print("thirty");
                    break;
                case 3:
                    System.out.print("forty");
                    break;
                case 4:
                    System.out.print("fifty");
                    break;
                case 5:
                    System.out.print("Sixty");
                    break;
                case 6:
                    System.out.print("Seventy");
                    break;
                case 7:
                    System.out.print("eighty");
                    break;
                case 8:
                    System.out.print("Ninety");
                    break;
                case 9:
                    System.out.print("One hundred ");
                    break;
            }
        }
    }
}
