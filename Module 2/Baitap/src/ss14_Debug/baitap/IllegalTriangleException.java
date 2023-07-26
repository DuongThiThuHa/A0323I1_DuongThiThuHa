package ss14_Debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài các cạnh của tam giác");

        int edge1, edge2, edge3 = 0;
        System.out.println("Cạnh thứ nhất: ");
        edge1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Cạnh thứ hai: ");
        edge2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Cạnh thứ ba: ");
        edge3 = Integer.parseInt(scanner.nextLine());

        try {
            checkTriangle(edge1, edge2, edge3);
            System.out.println("Chieu dai cac canh cua tam giac hop le");
        } catch (IllegalTriangleException e) {
            System.err.println("Khong du yeu cau de xay dung hinh tam giac");
        }
    }

    public static void checkTriangle(int edge1, int edge2, int edge3) throws IllegalTriangleException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            throw new IllegalTriangleException();
        }

        if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1) {
            throw new IllegalTriangleException();
        }
    }
}