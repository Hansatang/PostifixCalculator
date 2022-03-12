package Stack;

import Exception.EmptyListExpression;

public interface List<T> {
    boolean isEmpty();
    int size();
    void addToFront(T data);
    T removeFirst() throws EmptyListExpression;
}
