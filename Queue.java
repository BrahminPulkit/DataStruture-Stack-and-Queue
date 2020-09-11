package Working_With_Queue;
// Queue follows the  "FIFO"
public class Queue {
    private int DEFAULT_SIZE = 10;
    private int data[];
    private int end = 0;


    public Queue(){
        this.data = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean enQueue(int value){
        if (isFull()){
            return false;
        }
        data[end++] = value;
        return true;
    }
    public int  deQueue(){
        if (isEmpty()){
            return 0;
        }
        int temp = data[0];
        for (int i = 0; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return temp;
    }
    public void dispaly(){
        for (int i = 0; i <end ; i++) {
            System.out.println(data[i]+" ");
        }
        System.out.println("END ");
    }

}
