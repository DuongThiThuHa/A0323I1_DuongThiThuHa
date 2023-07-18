package ss10_Stack_Queue.baitap.Queue;

public class Queue<C> {
    public Node front;
    public Node rear;
    Queue(){
        this.front = null;
        this.rear = null;
    }

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    void enQueue(int data){
        Node node = new Node(data);
        if (this.rear == null){
            this.front = this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }

    Node deQueue(){
        if (this.front == null){

            return null;
        }
        Node change = this.front;
        this.front = this.front.next;
        if (this.front == null){
            this.rear = null;
        }
        return change;
    }

    void displayQueue(){
        if (front == null){
            System.out.println("Queue is null ");
            return;
        }
        Node change = front;
        if (change == null){
            System.out.println("Queue is : " + change.data);
            change = change.next;
        }
    }
}
