package ss17_String_Regex;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String a = "HaDTT";
        String b = new String("HaDTT");
        System.out.println(a==b);
        System.out.println(a.equals(b));

        StringBuffer stringBuffer = new StringBuffer("HaDTT");
        stringBuffer.append("CodeGym");
        System.out.println(stringBuffer);

        Scanner scanner = new Scanner(System.in);
        boolean isFlag;
        String string  = " ";
        do {
            System.out.println("Mời bạn nhập chuỗi : ");
            string = scanner.nextLine();
            //Định dạng ngày tháng năm
            isFlag = string.matches("^[0-9]{2}\\/((0[1-9])|(1[0-2])\\|[0-9]{4}$)");
            //Định dạng tên viết hoa
            isFlag = string.matches("(^[A-Z][a-z]+)( [A-Z][a-z])*$");
        } while (!isFlag);
    }
}
