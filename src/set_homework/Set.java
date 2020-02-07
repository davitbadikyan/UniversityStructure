package set_homework;

public interface Set<T extends Comparable> {

    int getSize();

    boolean add(T item);

    boolean remove(T item);

    boolean contains(T item);

}