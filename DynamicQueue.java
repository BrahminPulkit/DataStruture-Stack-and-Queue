package Working_With_Queue;

public class DynamicQueue extends CircularQueue {
    @Override
    public boolean enqueue(int value) {
        if (this.isFull()){
            int temp[]  = new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[(front+i)% data.length];
            }
            data = temp;
            front = 0;
            end = size;
        }
        return super.enqueue(value);
    }
}
