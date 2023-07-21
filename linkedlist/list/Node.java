package OOP_task4.linkedlist.list;

public class Node<T> {
    public T data;
    public Node<T> prev;
    public Node<T> next;

    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node(T data) { this(data, null, null); }

    @Override
    public String toString() {
        return data.toString();
    }
}