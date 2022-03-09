public class Queue<T> {

    Node<T> front;
    Node<T> rear;
    int count = 0;

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }


    public void enqueue(T item) {
        Node<T> temp = new Node<T>(item);
        if (rear == null) {
            front = temp;
            rear = temp;
            count++;
            return;
        }
        rear.next = temp;
        rear = temp;
        count++;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node<T> node = this.front;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


}
