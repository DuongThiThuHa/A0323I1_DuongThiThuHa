package ss10_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class BracketStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 bieu thuc bat ki: ");
        String input = sc.nextLine();
        if (checkOptimalBracket(input)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

    public static boolean checkOptimalBracket(String str) {
        String string = "";
        for (int i = 0; i < str.length() - 1; i++) {
            string += str.charAt(i + 1);
        }
        return checkBracket(str) && checkBracket(string);
    }

    public static boolean checkBracket(String str) {
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack1.push(String.valueOf(sym));
            } else if (sym == ')') {
                if (stack1.isEmpty()) {
                    return false;
                }
                String left = stack1.pop();
                if (left == null) {
                    return false;
                }
            }
        }
        if (stack1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
