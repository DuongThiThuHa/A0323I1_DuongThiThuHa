package ss4_ClassesAndObjects.thuchanh;

import java.util.Scanner;

public class HinhChuNhat {

    double width , height;
    public HinhChuNhat(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double dienTich(){
        return this.width * this.height;
    }

    public double chuVi(){
        return (this.width + this.height) * 2;
    }

    public String hienThi(){
        return "Hinh chu nhat co chieu dai la : "+height +"va chieu rong la : "+width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai : ");
        double height = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong : ");
        double width = scanner.nextDouble();

        HinhChuNhat hinhChuNhat = new HinhChuNhat(width,height);
        System.out.println("Chi vi hinh chu nhat la : "+ hinhChuNhat.chuVi());
        System.out.println("Dien tich hinh chu nhat la : "+ hinhChuNhat.dienTich());

    }
}