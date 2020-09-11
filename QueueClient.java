package Working_With_Queue;

public class QueueClient {
    public static void main(String[] args) {
        Queue client =  new Queue();
        client.enQueue(10);
        client.enQueue(20);
        client.enQueue(30);
        client.enQueue(40);
        client.dispaly();
    }
}
