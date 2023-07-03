package ss8_cleancode_refactoring.thuchanh;

public class Refactory {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';



    public static int Calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
            if (secondOperand != 0){
                return firstOperand / secondOperand;
            } else {
                throw new RuntimeException("Can not divide by 0");
            }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
