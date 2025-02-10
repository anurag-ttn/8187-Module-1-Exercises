

class Mclass{
    int x;
    int y;

    Mclass(int a , int b){
        x =a;
        y = b;
    }
}

public class Q4 {
    public static void main(String[] args) {
        ConstructorRef obj = Mclass::new;
        Mclass m1 = obj.getInstance(5,7);
        System.out.println("x = "+m1.x);
        System.out.println("y = "+m1.y);
    }
}
