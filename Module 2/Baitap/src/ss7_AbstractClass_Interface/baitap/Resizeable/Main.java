package ss7_AbstractClass_Interface.baitap.Resizeable;

import ss7_AbstractClass_Interface.baitap.Shape.Circle;
import ss7_AbstractClass_Interface.baitap.Shape.Rectangle;
import ss7_AbstractClass_Interface.baitap.Shape.Shape;
import ss7_AbstractClass_Interface.baitap.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(3.5, "orange", true);
        shape[1] = new Rectangle(5.0, 6.5, "blue", true);
        shape[2] = new Circle(6.5);

        ((Square) shape[0]).resize(20);
        ((Rectangle) shape[1]).resize(30);
        ((Circle) shape[2]).resize(40);

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }

    }
}
