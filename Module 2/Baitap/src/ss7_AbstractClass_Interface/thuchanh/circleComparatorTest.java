package ss7_AbstractClass_Interface.thuchanh;

import ss5_AccessModifier_StaticMethod_StaticProperty.baitap.Circle;
import ss7_AbstractClass_Interface.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class circleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6) {
            @Override
            public int compareTo(ComparableCircle o) {
                return 0;
            }
        };
        circles[1] = new Circle() {
            @Override
            public int compareTo(ComparableCircle o) {
                return 0;
            }
        };
        circles[2] = new Circle(3.5, "indigo", false) {
            @Override
            public int compareTo(ComparableCircle o) {
                return 0;
            }
        };

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new circleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
