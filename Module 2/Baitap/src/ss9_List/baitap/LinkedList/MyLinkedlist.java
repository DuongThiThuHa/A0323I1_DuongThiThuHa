package ss9_List.baitap.LinkedList;

public class MyLinkedlist<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phan tu dau tien trong danh sach lien ket
    private Node head;
    //So luong phan tu trong danh sach
    private int numNode = 0;

    public MyLinkedlist() {
    }

    public void addFirst(E element) {
        Node temp = head;
        //Bien head nhan gia tri la 1 Node moi
        head = new Node(element);
        //Tro head den temp
        head.next = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        //Tro con tro den vi tri cuoi cung cua ds
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        //Cho con tro chey den vi tri index-1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //Cho holder tham chieu den vi tri index
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNode;
    }

    public E remove(int index){
        if (index < 0 || index > numNode){
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0 ){
            data = temp.data;
            head = head.next;
        }
        else {
            for (int i = 0; i < index -1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;
        }
        return (E) data;
    }

    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
            }
            return true;
        }
    }

    public MyLinkedlist<E> clone(){
        if (numNode == 0){
            throw new NullPointerException("LinkedList is null!");
        }
        MyLinkedlist<E> returnLinkedList = new MyLinkedlist<>();
        Node temp = head;
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    //Kiem tra su ton tai
    public boolean constrains(E element){
        Node temp =head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(element) ){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
