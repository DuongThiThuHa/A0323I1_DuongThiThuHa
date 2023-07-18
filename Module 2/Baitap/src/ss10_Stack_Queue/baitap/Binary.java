package ss10_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thap phan muon chuyen : ");
        int number = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        while (number != 0){
            int count = number % 2;
            stack.push(count);
            number = number /2;
        }

        System.out.println("So nhi phan la : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


}

