package comp1110.homework.A01;

public interface List<T> {
    public void add(T e);
    public void remove(int index);
    public T get (int index);
    public int size();
    public void reverse();
    public String toString();

}
