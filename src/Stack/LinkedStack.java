package Stack;
import Exception.EmptyListExpression;


import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T obj) {
        list.addToFront(obj);
    }

    @Override
    public T pop() throws EmptyStackException {
        try {
            return list.removeFirst();
        } catch (EmptyListExpression e) {
            throw new EmptyStackException();
        }
    }
}
