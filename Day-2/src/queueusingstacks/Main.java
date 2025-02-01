package queueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.enqueue(8);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
