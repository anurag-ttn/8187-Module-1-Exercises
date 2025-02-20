

//WAP to showcase the difference between shutdown() and shutdownNow().
/*
in shutdown() the tasks already assigned will not be terminated but it stopped executor from taking new tasks to submit
so it do not stops running tasks
wgile in shutdownnow() all tasks after called it terminated and status of shutdown returned to true
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q5 {
    public static void main(String[] args) {
        ExecutorService ex1 = Executors.newFixedThreadPool(2);
        for(int i=0;i<1000;i++){
            ex1.submit(()->{
                System.out.println("executing by "+Thread.currentThread().getName());
            });
        }
        ex1.shutdownNow();
        System.out.println(ex1.isShutdown());

        ExecutorService ex2 = Executors.newFixedThreadPool(2);
        for(int i=0;i<1000;i++){
            ex2.submit(()->{
                System.out.println("executing by "+Thread.currentThread().getName());
            });
        }
        ex2.shutdown();
        System.out.println(ex1.isShutdown());

    }
}
