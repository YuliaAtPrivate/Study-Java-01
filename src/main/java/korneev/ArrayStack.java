package korneev;


import java.util.Arrays;

/**
 * Created by Yuta-At on 23/05/16.
 * Study array, class and other basics
 */

public class ArrayStack extends AbstractStack {
    private Object[] elements = new Object[0];

    {
        System.out.println("We are in ArrayStack non-static init1");
    }


    static {
        System.out.println("We are in ArrayStack static init");
    }

    {
        System.out.println("We are in ArrayStack non-static init2");
    }

    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int capacity){
        elements = new Object[capacity];
        System.out.println(elements.length);
    }

    public void push(Object item) {
        ensureCapacity(size + 1);
        elements[size++] = item;

    }

    private void ensureCapacity(int capacity) {
        if (elements.length >= capacity)
            return;
        Object[] newElements = new Object[capacity * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public Object popS() {
        return elements[size];
    }

    public Object peek() {
        if (size == 0)
            return null;
        return elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

}
