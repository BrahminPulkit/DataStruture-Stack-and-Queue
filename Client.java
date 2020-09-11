package Working_With_Queue;

public class Client {
    public static void main(String[] args) {
        DynamicQueue client = new DynamicQueue();
        client.enqueue(10);
        client.enqueue(11);
        client.enqueue(12);
        client.enqueue(13);
        client.display();

    }
}
