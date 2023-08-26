package Furama.until;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegexPerson {
    static Scanner scanner = new Scanner(System.in);


    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";
    private static final String REGEX_ID_CARD = "[0-9]{9}";
    private static final String REGEX_NUMBER_PHONE = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
    private static final String REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";


    public static LocalDate age() {
        LocalDate birthday;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            try {
                System.out.println("Nhập ngày sinh:");
                birthday = LocalDate.parse(scanner.nextLine(), formatter);
                LocalDate now = LocalDate.now();
                if (now.getYear() - birthday.getYear() < 18 || now.getYear() - birthday.getYear() > 100) {
                    throw new IOException("Tuổi Bạn phải trên 18 tuổi và dưới 100 tuổi");
                }
                return birthday;
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("Định dạng ngày sinh không chính xác (dd/MM/yyyy)");
            } catch (IOException e) {
                System.out.println("Tuổi Bạn phải trên 18 tuổi và dưới 100 tuổi");
            }

        }
    }

    public static String name() {
        System.out.println("Nhập tên bạn :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_NAME, "Bạn Nhập sai định dạng Mời Banh Nhập Lại");
    }


    public static String idCard() {
        System.out.println("Nhập chứng minh nhân dân : ");
        String newIDCard = scanner.nextLine();
        while (!newIDCard.matches(REGEX_ID_CARD)) {
            System.out.println("Bạn nhập sai định dạng, vui lòng quay lại !");
            newIDCard = scanner.nextLine();
        }
        return newIDCard;
    }

    public static String inputNewNumberPhone() {
        System.out.println("Enter Number Phone : ");
        String newNumberPhone = scanner.nextLine();
        while (!newNumberPhone.matches(REGEX_NUMBER_PHONE)) {
            System.out.println("You input bad format, please please get back !");
            newNumberPhone = scanner.nextLine();
        }
        return newNumberPhone;
    }

    public static String email() {
        System.out.println("Nhập email : ");
        String newEmail = scanner.nextLine();
        while (!newEmail.matches(REGEX_EMAIL)) {
            System.out.println("Bạn nhập sai định dạng, vui lòng quay lại !");
            newEmail = scanner.nextLine();
        }
        return newEmail;
    }


    public static double salary() {
        while (true) {
            try {
                System.out.println("Nhập lương ");
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số !!!");
            }
        }
    }
}
