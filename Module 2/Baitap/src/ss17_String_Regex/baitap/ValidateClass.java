package ss17_String_Regex.baitap;

import java.util.Scanner;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP]+\\d{4}[GHIKLM]$";
    public boolean isClassName(String name) {
        return name.matches(CLASS_REGEX);
    }
    public static void main(String[] args) {
        System.out.println("Enter class name : ");
        String className = new Scanner(System.in).nextLine();
        ValidateClass validateClass = new ValidateClass();
        System.out.println(" Class name " + className + " is " + validateClass.isClassName(className));
    }
}
