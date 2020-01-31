package threads;

/**
 * 1) Runnable is FunctionalInterface
 *
 */
public class RunnableExample  implements Runnable{

    public static void main(String[] x){
        System.out.println("Hello RunnableExample!!!");

        System.out.println("Main Thread Name  : " + Thread.currentThread().getName());
        System.out.println("Main Thread Group  : " + Thread.currentThread().getThreadGroup());
        System.out.println("Main Thread Priority  : " + Thread.currentThread().getPriority());
        System.out.println("Main Thread ID  : " + Thread.currentThread().getId());

        RunnableExample runnableExample1 = new RunnableExample();

        Thread thread1 = new Thread(runnableExample1);
        thread1.start();

        /**
         * Java8 Lambda implementation
         */
        Thread thread2 = new Thread(() ->{
            System.out.println("Child2 Thread Name  : " + Thread.currentThread().getName());
            System.out.println("Child2 Thread Group  : " + Thread.currentThread().getThreadGroup());
            System.out.println("Child2 Thread Priority  : " + Thread.currentThread().getPriority());
            System.out.println("Child2 Thread ID  : " + Thread.currentThread().getId());
            System.out.println("Child2 Thread ID  : " + Thread.currentThread().isDaemon());
        });
        thread2.start();

    }

    @Override
    public void run() {
        System.out.println("Child Thread Name  : " + Thread.currentThread().getName());
        System.out.println("Child Thread Group  : " + Thread.currentThread().getThreadGroup());
        System.out.println("Child Thread Priority  : " + Thread.currentThread().getPriority());
        System.out.println("Child Thread ID  : " + Thread.currentThread().getId());
        System.out.println("Child Thread ID  : " + Thread.currentThread().isDaemon());
    }
}
