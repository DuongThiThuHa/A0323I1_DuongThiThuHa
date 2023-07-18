package ss10_Stack_Queue.baitap.Queue;

public class Solution {
    public static void main(String[] args) {
        Queue<Character> queue = new Queue<Character>();
        queue.enQueue(24);
        queue.enQueue(12);
        queue.enQueue(18);
        queue.enQueue(10);
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
