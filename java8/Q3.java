/*
by using volatile keyword for any variable we enforce that its value should be read and write to the main memory not in the
cache that prevent unnecessary statements to be executed
 */

class Myclass extends Thread{
    public void run(){
        while(Q3.flag){
            System.out.println(Thread.currentThread().getName()+"  hello ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Q3 {
    public static volatile boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        Myclass m1 = new Myclass();
        m1.start();


        Thread.sleep(1000);
        flag = false;
    }
}
