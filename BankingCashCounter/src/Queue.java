public class Queue<T> {

    int queue[] = new int[99999999];
    int size;
    int front;
    int rear;

    public void enqueue(T data) {
        queue[rear] = (int) data;
        rear = rear + 1;
        size++;
    }

    public int dequeue() {
        int data = queue[front];
        front = front + 1;
        size--;
        return front;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == 5;
    }

    public static void main(String[] args) {

    }
}
