package ss10_Stack_Queue.baitap.Stack;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int[] arr, int size, int index) {
        this.arr = arr;
        this.size = size;
        this.index = index;
    }

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isFull(){
        return index == size;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null ");
        }
        return arr[-- index];
    }

    public int size(){
        return size;
    }

}
