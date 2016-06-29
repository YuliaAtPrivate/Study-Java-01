package korneev;

import org.junit.Test;

/**
 * Created by Yuta-At on 23/05/16.
 * Tests for ArrayStack class.
 */
public class ArrayStackTest {

//    private

    @Test
    public void mainOperations(){
        ArrayStack stack = new ArrayStack();

        for (int i = 0; i < 5 ; i++){
            stack.push( "elem " + i);
        }
        System.out.println(stack);
        System.out.println(stack.getSize());

        while (stack.getSize() != 0){
            System.out.println( stack.peek() + " ;");
            stack.pop();
        }
        System.out.println(stack);
        System.out.println(stack.getSize());


    }


}
