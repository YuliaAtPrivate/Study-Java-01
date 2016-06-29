package korneev;

import org.junit.Test;

/**
 * Created by Yuta-At on 23/05/16.
 * Tests for LinkedStack class.
 */
public class LinkedStackTest {

    private void fillArr (KorneevStack stack){
        for (int i = 0; i < 5 ; i++){
            stack.push( "elem " + i);
        }
        System.out.println(stack);
        System.out.println(stack.getSize());
    }

    private void dumpArr (KorneevStack stack){
        while (stack.getSize() != 0){
            System.out.println( stack.peek() + " ;");
            stack.pop();
        }
    }

    @Test
    public void mainOpers(){
        LinkedStack stack = new LinkedStack();
        fillArr(stack);
        dumpArr(stack);
        ArrayStack stack1 = new ArrayStack();
        fillArr(stack1);
        dumpArr(stack1);


        System.out.println(stack);
        System.out.println(stack.getSize());
    }
}
