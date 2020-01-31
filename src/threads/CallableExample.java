package threads;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 *  Callable vs Runnable
 *
 *  1) The Callable interface is similar to Runnable, in that both are designed for classes whose instances are potentially executed by another thread.
 *  A Runnable, however, does not return a result and cannot throw a checked exception.
 *
 *  2) Both Callable and Runnable are FunctionalInterfaces
 *     Callable has call() abstract method
 *     Runnable has run() abstract method
 *
 *  ExecutorService interface has 3 abstract 'submit" mentod
 *
 *  1) Future<T> submit(Callable<T> task);   -- submit a callable task , it will return the Future
 *  2) Future<T> submit(Runnable task, T result);
 *  3) Future<?> submit(Runnable task);
 *
 *
 *  Future Vs FutureTask
 *
 *  1) Future is an interface
 *     FutureTask is an implementation of RunnableFuture --> RunnableFuture is am implementation of Runnable and Future
 *     we can submit the FutureTasks to ExecutorService
 *
 * Both Future and FutureTask  can be used for Asynchronous coding, main thread handed execution to workerthreads and move forward.
 * once all the workerthreads completes, get the result from Future.get() method or FutureTask.get() method
 *
 *
 *
 */

public class CallableExample{

    public static void main(String[] x) throws InterruptedException, ExecutionException {
        System.out.println("Hello CallableExample!!!");


        ExecutorService executorService1 = Executors.newSingleThreadExecutor();


        Future future1 = executorService1.submit(()->{
            System.out.println("Callable Task, it returns String");
            return "Callable Return";
        });

        System.out.println(future1.get());
        executorService1.shutdown();


        /**
         * invokeAll
         */
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable callable1 = ()->{
          System.out.println( "Frist Callable");
          return "First";
        };
        Callable callable2 = ()->{
            System.out.println( "Second Callable");
            return "Second";
        };
        Callable callable3 = ()->{
            System.out.println( "Third Callable");
            return "Third";
        };

        List<Callable<String>> callableList = Arrays.asList(callable1, callable2, callable3);

        List<Future<String>> futures = executorService.invokeAll(callableList);

        for(Future<String> future: futures){
            System.out.println(future.get());
        }

        executorService.shutdown();


        /**
         * invokeAny
         */
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);

        String output = executorService2.invokeAny(callableList);

        System.out.println("Output of InvokeAny:- "+ output);
        executorService2.shutdown();


        ExecutorService executorService3 = Executors.newFixedThreadPool(2);

        /**
         * 1) FutureTask works as a Callable and Future
         */
        FutureTask futureTask = new FutureTask(()->{
            System.out.println("FutureTask");
            return "FutureTask return";
        });
        executorService3.execute(futureTask);
        System.out.println(futureTask.get());
        executorService3.shutdown();

    }


}
