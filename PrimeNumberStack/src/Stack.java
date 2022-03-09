public class Stack<T> {

    Node<T> head;
    int count = 0;

    class Node<T> {
        public T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public Stack() {
        this.head = null;
    }

    public void push(T data) {
        Node<T> node = new Node<T>(data);
        node.next = head;
        head = node;
        count++;
    }


    public void pop() {
        if (head == null) {
            System.out.println("Stack UnderFlow");
            return;
        }
        Node<T> temp = head;
        head = temp.next;
        temp = null;
        count--;
    }

    public T peek() {
        if (head == null) {
            System.out.println("Empty stack");
        }
        T temp = head.data;
        return temp;
    }

    public boolean isEmpty() {
        return count == 0 ? true : false;
    }

    public int size() {
        return count;
    }

    public String display() {
        Node<T> node = head;
        String temp = "";

        while (node.next != null) {
            temp += node.data + " ";
            node = node.next;
        }
        temp += node.data;
        return temp;
    }
}
