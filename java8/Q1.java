/*user thread can be created by two ways - implementing runnable interface and extending  Thread class
and run method must be overrided in both cases which is main method executed when start() called.
sleep method is used to hold a thread for certain time from executing thus giving this time to another running thread
which gives Interrupted exception need to be handeled .
and if a join (thread.join()) is called on thread means this thread must complete its execution before controlled passed to
the next line or next process.
 */

class UsingRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class UsingThread extends  Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        UsingRunnable runn = new UsingRunnable();
        Thread t1 = new Thread(runn,"Thr uing runn");
        UsingThread t2 = new UsingThread();
        t2.setName("Thr using Thre");
        t2.start();
        t1.start();

        t2.join();

        for(int i=0;i<12;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.sleep(200);
        }

    }
}
