package Stack;
import Exception.EmptyListExpression;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T>();
        newNode.setData(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyListExpression {
        if (isEmpty()) {
            throw new EmptyListExpression("Empty Stack.List");
        }
        Node<T> temp = head;
        head = head.getNext();
        size--;
        return temp.getData();

    }
}
