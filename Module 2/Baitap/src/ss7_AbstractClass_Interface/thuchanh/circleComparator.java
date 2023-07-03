package ss7_AbstractClass_Interface.thuchanh;

import ss5_AccessModifier_StaticMethod_StaticProperty.baitap.Circle;

import java.util.Comparator;

public class circleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
