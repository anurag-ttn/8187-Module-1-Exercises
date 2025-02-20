/*
Callable is an interface with call method which is used as functional interface .It is used to run while creating threads using
executor or executor service and perform multiple tasks with limited number of threads. the call method returns object after
 completing task.
 The main difference in run() of runnable and call() of callable is
 1. run do not return anything while call()_ return object type defined in definition
 2. call() method throws exception while run() do not throw any exception i.e why we can not write throws in run() definition
 */


import java.util.concurrent.*;


class ImplementCallable implements Callable<String>{
    private String thread;

    ImplementCallable(String threadname){
        thread=threadname;
    }
    @Override
    public String call() throws Exception{
        return "The currently running thread is "+thread;
    }

}

public class Q1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> f1 = executor.submit(new ImplementCallable("Thread one"));
        Future<String> f2 = executor.submit(new ImplementCallable("Thread two"));
        Future<String> f3 = executor.submit(new ImplementCallable("Thread three"));
        Future<String> f4 = executor.submit(new ImplementCallable("Thread four"));
        Future<String> f5 = executor.submit(new ImplementCallable("Thread five"));


        System.out.println(f1.get());
        System.out.println(f4.get());
        System.out.println(f5.get());

        executor.shutdownNow();

    }

}
