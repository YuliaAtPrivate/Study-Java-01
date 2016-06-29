package sandbox;

import Ut.YaUtils;
import korneev.LinkedStack;
import org.junit.Test;
import singletones.IvoryTower;

import java.util.*;

import static Ut.YaUtils.logInfo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Yuta-At on 24/05/16.
 * Test class to check some suggestions.
 */
public class MixedTest {

    private int multiply( int first) {
        first = first *2;
        return first;
    }

    @Test
    public void testFinalParam() {
        int my = 5;
        System.out.println(my);
        System.out.println(multiply(my));
    }

    class MyHash {
        @Override
        public int hashCode() {
            return 111;
        }
    }

    private enum MyEnum{
        ONE("onne"),
        TWO("twoo");

        MyEnum(String nameee){}

    }

    @Test
    public void testEnumNames(){
        logInfo(MyEnum.ONE);
        logInfo("just " + MyEnum.ONE);
        logInfo("name " + MyEnum.ONE.name());
        logInfo("implicit to string " + MyEnum.ONE.toString());
        logInfo("value of ONE " + MyEnum.valueOf("ONE"));
    }

    @Test
    public void testArrays() {

        MyHash m1 = new MyHash();
        MyHash m2 = new MyHash();
        Map<MyHash, String> map = new HashMap<>();
        map.put(m1, "");
        map.put(m2, "2v");
        map.put(m2, "3v");
        map.put(null, null);
        map.put(null, null);
        logInfo("map.toString()= " + map.toString());
        logInfo("map.keySet()= " + map.keySet());
        logInfo("map.values()= " + map.values());
        logInfo("map.size()= " + map.size());
//        assertThat(map.containsKey("m3"), is(true));
        assertThat(map.get("m3kkk"), org.hamcrest.Matchers.isEmptyOrNullString());
        assertThat(map.get("m1"), org.hamcrest.Matchers.isEmptyOrNullString());
        logInfo(map.get("sdfsdfsf")==null);
        logInfo(org.hamcrest.Matchers.isEmptyOrNullString().matches(map.get("sdfsdff")));
        logInfo(! (true && true));

    }
}
