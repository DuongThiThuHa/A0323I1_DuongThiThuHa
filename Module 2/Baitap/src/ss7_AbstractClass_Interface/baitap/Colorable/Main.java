package ss7_AbstractClass_Interface.baitap.Colorable;

import ss7_AbstractClass_Interface.baitap.Shape.Circle;
import ss7_AbstractClass_Interface.baitap.Shape.Rectangle;
import ss7_AbstractClass_Interface.baitap.Shape.Shape;
import ss7_AbstractClass_Interface.baitap.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3.0);
        shape[1] = new Rectangle(6.0, 7.0,"Orange", false);
        shape[2] = new Square(5.0, "Blue", false);

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Area: ");
            if (shape[i] instanceof ss7_AbstractClass_Interface.baitap.Shape.Circle) {
                System.out.println("The area Circle: " + ((ss7_AbstractClass_Interface.baitap.Shape.Circle)shape[i]).getArea());
            } else if (shape[i] instanceof ss7_AbstractClass_Interface.baitap.Shape.Rectangle) {
                System.out.println("The area Rectangle: " + ((ss7_AbstractClass_Interface.baitap.Shape.Rectangle)shape[i]).getArea());
            } else if (shape[i] instanceof Square) {
                System.out.println("The area Square: " + ((Square)shape[i]).howtoColor);
            }
        }
    }
}
