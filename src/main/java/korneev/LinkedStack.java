package korneev;

import java.util.Arrays;

/**
 * Created by Yuta-At on 23/05/16.
 * Study to create Linked stack.
 * Linked stack contains of nodes, have a head, every node knows it's next.
 */
public class LinkedStack extends AbstractStack {

    private Node head;
    private class Node{
        private Object value;
        private Node next;
        @Override
        public String toString(){
            return ("value = " + this.value + ", next = " + next);
        }

        private Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void push (Object item){
        head = new Node(item, head);
        size++;
    }

    public Object popS(){
        Object value = head.value;
        head = head.next;
        return value;
    }


    public Object peek(){
        if (head == null)
            return null;
        return head.value;
    }

}

