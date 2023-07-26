package ss14_Debug.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class CreateRandom {
    public Integer[] createRandom() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap vao so luong phan tu co trong mang : ");
        int number = Integer.parseInt(scanner.nextLine());
        Integer[] array = new Integer[number];
        System.out.println("Danh sach cac phan tu trong mang: ");
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        CreateRandom arrExample = new CreateRandom();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhap vao 1 chi so bat ky : ");
        int x = scanner.nextInt();
        try {
            // Code co the nem ra ngoai le
            System.out.println("Gia tri cua phan tu tai chi so " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            //Code xu ly ngoai le
            System.err.println("Chi so vuot qua so luong mang ! ");
        }
    }
}
