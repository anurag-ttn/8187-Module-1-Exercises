
interface A{
    void Amethod();
    default void showA(){
        System.out.println("default in A");
    }
}
interface B{
    void Bmethod();
    default void showB(){
        System.out.println("default in B");
    }
}

public class Q3 implements A,B {
    public static void main(String[] args) {
            B obj = new Q3();
            A ob1 = new Q3();
            ob1.Amethod();
            obj.showB();
    }
    @Override
    public void Amethod() {
        System.out.println("overriding A");
    }
    @Override
    public void Bmethod() {
        System.out.println("overriding B");
    }
}
