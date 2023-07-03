package ss8_MVC;

public class CleanCode {

    public static final int JANUARY = 1;

    public static int getDayOfMonth(int month, int year) {
        switch (month) {
//            Magic value => static final
            case JANUARY:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

//    1 phương thức không neen quá dài và đảm nhiềm nhiều nhiệm vụ
//    => tách method => nâng cao khả năng tái dungj
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    public static void main(String[] args) {
    }
}
