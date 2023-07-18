package ss10_Stack_Queue.baitap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ki tu bat ki : ");
        String str = scanner.nextLine();

        if (checkPalindrome(str)){
            System.out.println("Chuoi nay la 1 chuoi palindrome");
        }
        else {
            System.out.println("Chuoi nay khong phai la chuoi palindrome");
        }
    }

    public static boolean checkPalindrome(String str){
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            String arr = String.valueOf(str.charAt(i)).toLowerCase(Locale.ROOT);
            if (!arr.equals(" ")){
                stack.push(arr);
                queue.add(arr);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.pop().equals(queue.remove())){
                return false;
            }
        }
        return true;
    }
}
