package ss2_Loop.baitap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 100;
        int status = 1;
        int num = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Các số nguyên tố nhơ hơn 100: ");

        if (n >= 1) {
            System.out.println(2);
        }
        for (int i = 1; i <= 24; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
