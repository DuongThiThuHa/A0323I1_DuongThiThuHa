package ss7_AbstractClass_Interface.thuchanh.Animal;

import ss7_AbstractClass_Interface.thuchanh.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: click chick";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
