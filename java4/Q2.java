
class Cal{
    void add(int a , int b){
        System.out.println("addition of "+a+" and "+b+" is :"+(a+b));
    }

    void subtract(int a , int b){
        System.out.println("subtraction of "+b+" from "+a+" is :"+(a-b));
    }

    static void multiplication(int a , int b){
            System.out.println("multiplication of "+a+" and "+b+" is :"+(a*b));
    }
}
public class Q2 {
    public static void main(String[] args) {
        ASMDinterface add = new Cal()::add;
        add.performOP(10,20);

        ASMDinterface sub = new Cal()::subtract;
        sub.performOP(20,10);

        ASMDinterface mul = Cal::multiplication;
        mul.performOP(5,10);
    }
}
