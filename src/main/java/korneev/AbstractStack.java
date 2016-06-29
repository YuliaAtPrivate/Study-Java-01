package korneev;

/**
 * Created by Yuta-At on 24/05/16.
 * abstract class for Stack
 */
public abstract class AbstractStack implements KorneevStack {
    protected int size;

    public static final String AAA = getAAA();

    static {
        System.out.println("Here we are static!");
    }

    static String getAAA(){
        if (Math.random() > .5)
            return "AAA";
        else  return  "BBB";
    }

    public final int getSize(){
        System.out.println(AAA);
        return size;
    }

    public final boolean isEmpty(){
        return size > 0;
    }

    public Object pop(){
        if (size==0){
            return null;
        }
        size--;
        return popS();
    }

    protected abstract Object popS();
}
