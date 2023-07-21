package OOP_task4.linkedlist;

public interface List<T> extends Iterable<T> {
    List<T> add(T t);
    List<T> add(int i, T t);
    void remove(int i);
    T get(int i);
    int size();
    void update(int i, T t);

}