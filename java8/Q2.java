/*
In synchronised method whole method would be executed for current thread then lock is removed thus not giving resources to
other thread even if remain idle or sleeping for a time

In synchronised block only certain lines of code are locked thus giving resources to other if remain idle for some time thus
uses system resources efficiently
 */

class SyncClass extends Thread{

    static int lock = 0;
    @Override
    public void run(){
        perform();
    }

    public synchronized void perform(){
        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            lock++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        // using synchronized block inside method
        SyncMethodClass s1 = new SyncMethodClass();
        Thread t1 = new Thread(s1,"first thread");
        Thread t2 = new Thread(s1,"second thread");
        t1.start();t2.start();

        t1.join();t2.join();
        System.out.println(SyncMethodClass.lock);


        // using synchronised method
        SyncClass s2 = new SyncClass();
        Thread t3 = new Thread(s2,"first thread");
        Thread t4 = new Thread(s2,"second thread");
        t3.start();t4.start();

        t3.join();t4.join();
        System.out.println(SyncClass.lock);
    }
}

class SyncMethodClass extends Thread{
    static int lock =0;
    @Override
    public void run(){
        perform();
    }

    public void perform(){
        for(int i=0;i<50;i++){
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                lock = lock+1;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

