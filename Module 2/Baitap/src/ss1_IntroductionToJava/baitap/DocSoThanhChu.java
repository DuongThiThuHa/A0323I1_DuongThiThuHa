package ss1_IntroductionToJava.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Nhap vao 1 so nguyen khong am de doc: ");
        num = sc.nextInt();

        String so = "";
        int one = num % 10;
        int ten = (num / 10) % 10;
        int hundred = (num / 100) % 10;
        int thousand = (num / 1000) % 10;

        switch (thousand) {
            case 1:
                so += "One Thousand";
                break;
            case 2:
                so += "Two Thousand";
                break;
            case 3:
                so += "Three Thousand";
                break;
            case 4:
                so += "Four Thousand";
                break;
            case 5:
                so += "Five Thousand";
                break;
            case 6:
                so += "Six Thousand";
                break;
            case 7:
                so += "Seven Thousand";
                break;
            case 8:
                so += "Eight Thousand";
                break;
            case 9:
                so += "Nine Thousand";
                break;
            default:
                break;
        }

        switch (hundred) {
            case 1:
                so += "One Hundred";
                break;
            case 2:
                so += "Two Hundred";
                break;
            case 3:
                so += "Three Hundred";
                break;
            case 4:
                so += "Four Hundred";
                break;
            case 5:
                so += "Five Hundred";
                break;
            case 6:
                so += "Six Hundred";
                break;
            case 7:
                so += "Seven Hundred";
                break;
            case 8:
                so += "Eight Hundred";
                break;
            case 9:
                so += "Nine Hundred";
                break;

            default:
                break;
        }

        switch (ten) {
            case 1:
                so += "Eleven";
                break;
            case 2:
                so += "Twelve";
                break;
            case 3:
                so += "Thirteen";
                break;
            case 4:
                so += "Fourteen";
                break;
            case 5:
                so += "Fiveteen";
                break;
            case 6:
                so += "Sixteen";
                break;
            case 7:
                so += "Seventeen";
                break;
            case 8:
                so += "Eighteen";
                break;
            case 9:
                so += "Nineteen";
                break;

            default:
                break;
        }

        switch (one) {
            case 0:
                if (num == 0) {
                    so += "Zero";
                    break;
                }
                break;
            case 1:
                if (ten == 0) {
                    so += "One";
                } else {
                    so += "Two";
                }
                break;
            case 3:
                so += "Three";
                break;
            case 4:
                so += "Four";
                break;
            case 5:
                so += "Five";
                break;
            case 6:
                so += "Six";
                break;
            case 7:
                so += "Seven";
                break;
            case 8:
                so += "Eight";
                break;
            case 9:
                so += "Nine";
                break;
            case 10:
                so += "Ten";
                break;
            default:
                break;
        }
        System.out.println("Số " + num + " được đọc là: " + so);
    }
}

