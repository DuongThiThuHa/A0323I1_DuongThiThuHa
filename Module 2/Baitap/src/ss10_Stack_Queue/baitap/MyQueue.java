package ss10_Stack_Queue.baitap;

public class MyQueue {
    private final int capacity;
    private final int[] queueArr;
    private int head;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = currentSize == capacity;
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = currentSize == 0;
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Overflow ! Ubable to add element : "+ item);
        }
        else {
            tail++;
            if (tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element "+ item + " is pushed to Queue !");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow! Unable to remove element from Queue");
        }
        else {
            head++;
            if (head == capacity -1){
                System.out.println("Pop operation done ! Remove : "+ queueArr[head - 1]);
                head = 0;
            }
            else {
                System.out.println("Pop operation done ! Remove : "+ queueArr[head -1 ]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(12);
        queue.dequeue();
        queue.enqueue(18);
        queue.dequeue();
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(1);
        queue.enqueue(20);
        queue.enqueue(2);
    }
}
