public class LinkedStack<T> implements Stack<T> {
    private LinkedList<T> list;

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T obj) {
        list.addToFront(obj);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }
}
