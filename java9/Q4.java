/*
to store the result in future we implement call method of callable which return result and
stored in future<T> f variable and we can get the value using f.get();
a method random() of math class is used to get the random variable which provides long value
from 0.0  to 1.0 I multiplied it with 1000 so it return random value from 0 to 1000
after converting to int.
 */


import java.util.concurrent.*;

class CallableClassrandom implements Callable<Integer>{
    public Integer call(){
        return (int)(Math.random()*1000);
    }
}

public class Q4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Integer> f = ex.submit(new CallableClassrandom());
        System.out.println(f.get());
        ex.shutdown();
    }
}
