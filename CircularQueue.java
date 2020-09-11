package Working_With_Queue;

public class CircularQueue {
    public int data[];
    public int DEFAULT_SIZE = 10;
    public int front = 0;
    public int end = 0;
    public int size = 0;

    public CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
        }
        data[end++] = value;
        end = end % data.length;
        size++;
        return true;
    }
    public boolean isEmpty(){
        return this.size ==0;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("list is Empty ");
            return 0;
        }
        int temp = data[front];
        front++;
        front = front % data.length;
        size --;

        return temp;
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(data[front+i]% data.length+" ");
        }
        System.out.println("END");
    }
}
