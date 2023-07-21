package OOP_task4.linkedlist;

public interface Deque<T> extends Iterable<T>{
    boolean isEmpty();
    void addFirst(T t);
    void addLast(T t);
    void removeFirst();
    void removeLast();
}