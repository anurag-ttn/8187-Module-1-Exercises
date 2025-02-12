

interface MyInter{
    default void method1(){
        System.out.println("default method in interface !");
    }
    static void stmethod(){
        System.out.println("static method in interface");
    }
}


public class Q2 implements MyInter{
     public void forSuper(){
        MyInter.super.method1();
    }
    public static void main(String[] args) {
        MyInter.stmethod();
        MyInter obj = new MyInter() {};
        obj.method1();

        MyInter Q2obj = new Q2();
        Q2obj.method1();
        }
}
