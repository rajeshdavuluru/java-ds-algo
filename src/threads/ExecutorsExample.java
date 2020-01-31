package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    public static void main(String[] x){

        System.out.println("Hello ExecutorsExample!!!");

        /**
         * 1) Creates the executor with the Single worker thread
         * 2) All tasks will be executed sequentially
         * 3) if any thread terminates due to failure before completion, new thread will be created
         *
         */
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        });

        System.out.println(executor.isTerminated());
        System.out.println(executor.isShutdown());

        /**
         * initiates the orderly shutdown, no new  tasks will be allowed.
         * this method does not wait for actively executing tasks to terminate.
         */
        executor.shutdown();
        try {
            /**
             * Blocks until all tasks have completed execution after a shutdown
             * request, or the timeout occurs, or the current thread is
             * interrupted, whichever happens first.
             */
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(executor.isTerminated());
        System.out.println(executor.isShutdown());

        /**
         *  Terminates all the executing tasks and halt the waiting tasks, returns list of all terminated tasks.
         *  this method does not wait for actively executing tasks to terminate.
          */

        executor.shutdownNow();

        /****************************************************************************/

        /**
         * Executor with multiple tasks
         */

        /**
         *  1) Executor created with the fixed number of threads
         *  2) if the number of tasks more than the threads , excessive tasks will stay in queue
         *  3) if any thread terminates due to failure before completion, new thread will be created
         */
        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        Runnable runnable1 = ()->{

            try {
                TimeUnit.SECONDS.sleep(6);
                System.out.println("First Runnable: "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = ()->{

            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Second Runnable: "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable3 = ()->{

            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("THird Runnable: "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor1.submit(runnable1);
        executor1.submit(runnable2);
        executor1.submit(runnable3);

        System.out.println(executor1.isShutdown());
        System.out.println(executor1.isTerminated());

        executor1.shutdown();
        try {
            executor1.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(executor1.isShutdown());
        System.out.println(executor1.isTerminated());


        //Executor with single thread
        ExecutorService executor2 = Executors.newSingleThreadExecutor();

        //Executor with single thread with scheduler
        ScheduledExecutorService executor3 = Executors.newSingleThreadScheduledExecutor();



        //Executor with fixed number of threads
        ExecutorService executor4 = Executors.newFixedThreadPool(21);

        /**
         * 1) Creates the Threads and put that thread on the cache
         * 2) Next tasks will get the thread from the cache, if any thread available
         * 3) If any thread is not used for a 60 seconds, those threads will be removed from the cache
         */
        ExecutorService executor5 = Executors.newCachedThreadPool();

        /**
         * 1) Creates a thread pool to execute after some time delay/schedule
         */
        ScheduledExecutorService executor6 = Executors.newScheduledThreadPool(1);

        executor6.schedule(()->{System.out.println("Scheduled Thread");}, 2, TimeUnit.SECONDS);

        //TODO
        executor6.scheduleWithFixedDelay(()->{System.out.println("Schedule with fixed delay");}, 0, 2, TimeUnit.SECONDS);

        executor6.shutdown();

        /**
         * 1) Creates Work-Stealing thread pool
         */
        ExecutorService executor7 = Executors.newWorkStealingPool();


    }
}
