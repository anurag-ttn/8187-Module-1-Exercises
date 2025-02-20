

// Use a singleThreadExecutor, newCachedThreadPool()
// and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex1 = Executors.newFixedThreadPool(2);
        ExecutorService ex2 = Executors.newSingleThreadExecutor();
        ExecutorService ex3 = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){
            ex1.submit(()->{
                System.out.println(" service is run by"+Thread.currentThread().getName()+ " in new fixed pool");
            });
        }

        for(int i=0;i<10;i++){
            ex3.submit(()->{
                System.out.println(" service is run by"+Thread.currentThread().getName()+ " in new cached pool");
            });
        }

        for(int i=0;i<10;i++){
            ex2.submit(()->{
                System.out.println(" service is run by"+Thread.currentThread().getName()+ " in new single thread pool");
            });
        }
        Thread.sleep(2000);
        ex1.shutdown();ex2.shutdownNow();ex3.shutdown();
    }
}
