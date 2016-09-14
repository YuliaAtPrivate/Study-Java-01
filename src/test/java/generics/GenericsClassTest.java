package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Yulia_Atlasova on 9/14/2016.
 */
public class GenericsClassTest {

    @Test
    public void checkRawData(){
        List rawData = new ArrayList();
        rawData.add(8);
        rawData.add("8");
        System.out.println(rawData.get(0).getClass()); //returns Integer
        System.out.println(rawData.get(1).getClass()); //returns String
//        String s = rawData.get(1);   Error! Required String, got Object.
    }

    class SomeClass<T>{
        public <E> void test(Collection<E> collection){
            System.out.println("First method");
            collection.forEach(System.out::println);
        }
        public void test(List<Integer> list){
            System.out.println("Second Method");
            list.forEach(System.out::println);
        }
    }

    @Test
    public void testGenericClassLoseGenericInfoIfWeCallItAsRawData(){
        SomeClass sc = new SomeClass();
        List<String> stringList = Arrays.asList("value");
        sc.test(stringList); // RunTime Exception! If we call SomeClass without generic,
        // then all further generic info is lost and in Runtime second method (applied to List
        // of any kind (we lost info about Integer) try to run instead of first method.
//        so we get error that required Integer, got String.
    }

    @Test
    public void testGenericClassSaveGenericInfoIfWeCallItAsGenericData() {
        SomeClass<String> sc = new SomeClass();
        List<String> stringList = Arrays.asList("value");
        sc.test(stringList);
    }
}
