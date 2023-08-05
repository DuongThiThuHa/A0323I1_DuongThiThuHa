package ss17_String_Regex.baitap;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public boolean isPhoneNumber(String name) {
        return name.matches(PHONE_NUMBER_REGEX);
    }

    public static void main(String[] args) {
        System.out.println("Enter phone number : ");
        String phoneNumber = new Scanner(System.in).nextLine();
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        System.out.println(" Class name " + phoneNumber + " is " + validatePhoneNumber.isPhoneNumber(phoneNumber));
    }
}
