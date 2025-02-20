//import java.io.Closeable;
//import java.util.concurrent.BlockingDeque;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class ProdCon {
//    volatile static boolean flag = true;
//
//    synchronized void producer() throws InterruptedException {
//        while (true) {
//            if (flag) {
//                wait();
//            }
//            flag = true;
//            System.out.println("material produced");
//            notify();
//        }
//    }
//
//    synchronized void consumer() throws InterruptedException {
//        while (true) {
//            if (!flag) {
//                wait();
//            }
//
//
//            System.out.println("material consumed");
//            flag = false;
//            notify();
//        }
//    }
//
//}
//public class Main{
//    public static void main(String[] args) {
//        ProdCon pc1 = new ProdCon();
//        Thread t1 = new Thread(()-> {
//            try {
//                pc1.consumer();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            try {
//                pc1.producer();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        t1.start();t2.start();
//    }
//}
//
////ReentrantLock
//Closeable