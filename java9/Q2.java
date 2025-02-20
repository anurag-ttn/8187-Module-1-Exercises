import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resolve{
    Lock l1 = new ReentrantLock();
    Lock l2 = new ReentrantLock();

    void getlocks(){
        while(true) {
            if(l1.tryLock() && l2.tryLock()){
                return;
            }
            if(l1.tryLock()) l1.unlock();
            if(l2.tryLock()) l2.unlock();
        }
    }
    void get1() throws InterruptedException {
        getlocks();
        {
            System.out.println("1 get 1");
            Thread.sleep(1000);
            {
                System.out.println("1 get 2");
            }
            System.out.println("1 leave 2");
        }
        System.out.println("1 leave 1");
        l1.unlock();l2.unlock();
    }

    void get2() throws InterruptedException {
        getlocks();
        {
            System.out.println("2 get 2");
            Thread.sleep(1000);
            {
                System.out.println("2 get 1");
            }
            System.out.println("2 leave 1");
        }
        System.out.println("2 leave 2");

    }

}

public class Q2{
    public static void main(String[] args) {
        Resolve res = new Resolve();
        Thread t1 = new Thread(()->{
            try {
                res.get1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try {
                res.get2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();t2.start();
    }
}
