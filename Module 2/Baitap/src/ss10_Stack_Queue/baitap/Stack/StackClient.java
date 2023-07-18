package ss10_Stack_Queue.baitap.Stack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(24);
        stack.push(12);
        stack.push(18);
        stack.push(10);

        System.out.println("1. Size of stack after operations : "+stack.size());
        System.out.println("2. Pop elements from stack : ");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3. Size of stack aftre pop operations : "+ stack.size());
    }


}
