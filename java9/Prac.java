import java.util.Map;

public class Prac {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           for(int i=0;i<1000;i++) {
               System.out.println(i);
           }
        });
        t1.start();
        System.out.println(t1.isInterrupted());
    }
}
