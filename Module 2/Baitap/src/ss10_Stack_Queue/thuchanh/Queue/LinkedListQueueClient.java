package ss10_Stack_Queue.thuchanh.Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(24);
        queue.enqueue(12);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(18);
        queue.enqueue(10);
        System.out.println("Dequeued item is : "+ queue.dequeue().key);
    }
}
