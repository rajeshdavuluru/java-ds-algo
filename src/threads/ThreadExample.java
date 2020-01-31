package threads;


public class ThreadExample extends Thread {

    public static void main(String[] x){
        System.out.println("Hello ThreadExample!!");

        System.out.println("Main Thread Name  : " + Thread.currentThread().getName());
        System.out.println("Main Thread Group  : " + Thread.currentThread().getThreadGroup());
        System.out.println("Main Thread Priority  : " + Thread.currentThread().getPriority());
        System.out.println("Main Thread ID  : " + Thread.currentThread().getId());

        ThreadExample threadExample = new ThreadExample();
        threadExample.setName("Thread1");
        threadExample.setPriority(1);
        threadExample.start();

        /*
        *  Even though threadExample1 has high priority, threadExample will complete first because of join() method
        */
        try {
            threadExample.join();  // waits this thread to die
            //threadExample.join(1000); // waits 1000 milli seconds
            //threadExample.join(1000, 21); // waits 1000 milli  21 nano seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.setName("Thread2");

        threadExample1.setPriority(10);
        threadExample1.start();
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
