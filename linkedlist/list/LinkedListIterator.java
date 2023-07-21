package OOP_task4.linkedlist.list;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;

    public LinkedListIterator(Node<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T res = current.data;
        current = current.next;
        return res;
    }
}
