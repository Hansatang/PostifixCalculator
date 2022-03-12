package Stack;

import java.util.EmptyStackException;

public interface Stack<T> {
    boolean isEmpty();
    void push(T obj);
    T pop() throws EmptyStackException;
}
