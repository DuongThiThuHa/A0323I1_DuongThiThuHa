package ss7_AbstractClass_Interface;

import ss5_AccessModifier_StaticMethod_StaticProperty.baitap.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    private static final double radius = 5;

    public ComparableCircle() {
        super(radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}