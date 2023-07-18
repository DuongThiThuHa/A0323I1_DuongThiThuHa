package ss10_Stack_Queue.thuchanh.GenericStack;

public class GenericStackClient {
    public static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Twenty-Four");
        stack.push("Twelve");
        stack.push("Eighteen");
        stack.push("Ten");
        System.out.println("1.1. Side of stack after push operations : "+stack.size());
        System.out.println("1.2. Pop elements from  stack: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("1.3. Size of stack after pop operations : "+stack.size());
    }

    private static void stackOfIntergers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(24);
        stack.push(12);
        stack.push(18);
        stack.push(10);
        System.out.println("2.1. Size of stack after push operations : "+stack.size());
        System.out.println("2.2. Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3.3. Size of stack after pop operations : "+ stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Integers: ");
        stackOfIntergers();
        System.out.println("2. Stack of Strings: ");
        stackOfStrings();
    }
}
