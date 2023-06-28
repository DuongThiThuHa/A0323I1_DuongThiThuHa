package ss3_mang.baitap;

import java.util.Scanner;

public class ChenMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong cho mang array : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu "+i+" vao mang :");
            array[i]= scanner.nextInt();
        }

        int[] newArray = new int[n];

        System.out.println("Nhap vao 1 phan tu muon them vao mang");
        int giaTri = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vi tri muon chen phan tu "+giaTri+" vao mang ");
        int viTri = Integer.parseInt(scanner.nextLine());

        if (viTri <= 1 && viTri >= array.length-1){
            System.out.println("Khong chen duoc phan tu"+giaTri+" vao mang");
        }

        System.arraycopy(array,0,newArray,0,giaTri);
        newArray[viTri] = giaTri;
        System.arraycopy(array,viTri,newArray,viTri+1,array.length - viTri);

    }
}
