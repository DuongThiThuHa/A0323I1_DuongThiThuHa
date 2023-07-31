package ss4_ClassesAndObjects.baitap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private final double a;
    private final double b;
    private final double c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {

        return this.a;
    }

    public double getB() {

        return this.b;
    }

    public double getC() {

        return this.c;
    }

    public double getDelta() {

        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {

        return (-this.getB() + Math.sqrt(this.getDelta())) / 2 * this.getA();
    }

    public double getRoot2() {

        return (-this.getB() - Math.sqrt(this.getDelta())) / 2 * this.getA();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(1, 2, 3);
        if (pt.getDelta() > 0) {
            System.out.println("Nghiem x1 = " + pt.getRoot1());
            System.out.println("Nghiem x2 = " + pt.getRoot2());
        } else if (pt.getDelta() == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + pt.getRoot2());
        } else {
            System.out.println("Phuong trinh vo nghiem ");
        }
    }

}
