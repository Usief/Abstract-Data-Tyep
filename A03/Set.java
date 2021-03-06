package comp1110.homework.A03;

public interface Set<T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
    int size();
    String toString();
    Set<T> newInstance();
}
