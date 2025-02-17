
class myobj{
    int x =0;
    int y=0;
}

public class Q4{
    public static void main(String[] args) {
        myobj m1 = new myobj();
        myobj m2 = new myobj();

        Thread t1 = new Thread(()->{
            synchronized (m1) {
                System.out.println("m1 by t1");

                synchronized (m2) {
                    System.out.println("m2 by t1");
                }
            }
        });


        Thread t2 = new Thread(()->{
            synchronized (m2) {
                System.out.println("m2 by t2");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (m1) {
                    System.out.println("m1 by t2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}