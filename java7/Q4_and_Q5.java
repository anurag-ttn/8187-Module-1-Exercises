
/*if i declare a class as sealed then class named must be given with permits keyword which can extend class A.
class which extend A must be declared final,sealed or nonsealed
final can notbe extended further
sealed can be extended by permited other classes
non sealed work as a normal class
 */

sealed class A permits B,C {
    void Amethod(){
        System.out.println("method in A");
    }
}

final class B extends A{
    void Bmethod(){
        System.out.println("method in B");
    }
}

non-sealed class C extends  A{
    void Cmethod(){
        System.out.println("method in c");
    }
}




public class Q4_and_Q5 {
    public static void main(String[] args) {
        A a = new A();
        a.Amethod();
        A b = new B();
        b.Amethod();
        B b1 = new B();
        b1.Bmethod();
        C c = new C();
        c.Cmethod();
        c.Amethod();
    }
}
