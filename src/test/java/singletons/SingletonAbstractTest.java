package singletons;

import org.junit.Test;
import singletones.IvoryTower;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.logging.Level;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by Yuta-At on 24/05/16.
 * <p>
 * This class provides several test case that test singleton construction.
 * <p>
 * The first proves that multiple calls to the singleton getInstance object are the same when called
 * in the SAME thread. The second proves that multiple calls to the singleton getInstance object are
 * the same when called in the DIFFERENT thread.
 * <p>
 * Date: 12/29/15 - 19:25 PM
 *
 * @author Jeroen Meulemeester
 * @author Richard Jones
 */

public abstract class SingletonAbstractTest<S> {

    /**
     * The singleton's getInstance method
     */
    private final Supplier<S> singletonInstanceMethod;


    /**
     * Create a new singleton test instance using the given 'getInstance' method
     *
     * @param singletonInstanceMethod The singleton's getInstance method
     */
    public SingletonAbstractTest(final Supplier<S> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    @Test
    public void testMultipleCallsReturnTheSameObjectInTheSameThread() {
        //Create several instances in the same calling thread
        S instanse1 = this.singletonInstanceMethod.get();
        S instanse2 = this.singletonInstanceMethod.get();
        S instanse3 = this.singletonInstanceMethod.get();

        assertSame(instanse1, instanse2);
        assertSame(instanse1, instanse3);
        assertSame(instanse2, instanse3);


        System.out.println("test of multiple singleton creation in one thread is finished");
    }

    /**
     * Test singleton instance in a concurrent setting
     */
    @Test(timeout = 10000)
    public void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception {

        //Create 1000 tasks and inside each callable instanciate the singleton class
        final List<Callable<S>> tasks = new ArrayList<>();
        for (int i=0; i<1000; i++){
            tasks.add(this.singletonInstanceMethod::get);
        }
        //Use up to 8 concurrent threads to handle the tasks
        final ExecutorService executorService = Executors.newFixedThreadPool(8);
        final List<Future<S>> results = executorService.invokeAll(tasks);

        //wait for all the threads to complete
        final S expectedInstance = this.singletonInstanceMethod.get();
        for (Future<S> res : results){
            final S instance = res.get();
            assertNotNull(instance);
            assertSame(expectedInstance, instance);
        }

        //tidy up the executor
        executorService.shutdown();

        System.out.println("test of multiple singleton creation in 8 threads is finished");
    }


}
