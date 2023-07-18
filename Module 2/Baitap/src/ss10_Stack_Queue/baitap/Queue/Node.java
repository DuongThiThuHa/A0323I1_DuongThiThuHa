package ss10_Stack_Queue.baitap.Queue;

public class Node {
    public int data;
    public Node link;
    public Node next;

    Node(int x ){
        this.data = x;
        this.link = null;
    }

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
