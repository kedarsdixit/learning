package stack;

import java.util.EmptyStackException;


public class KdStack<T> {

    private T data;
    private KdStack<T> next;
    private KdStack<T> top;

    public KdStack(T data) {
        this.data = data;
    }

    public T pop() {
        if (top == null)
            throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {

        KdStack<T> t = new KdStack<T>(item);
        t.next = top;
        top = t;

    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {

        return top == null;
    }
}
