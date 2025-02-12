import java.util.function.*;

public class Q1 {
    public static void main(String[] args) {
        Consumer<String> c1 = (name)-> {
            name = "Hello "+name;
            System.out.println(name);
        };
        c1.accept("Anurag");

        Function<Integer,String> f1 = (val)-> {
            return "value of input is : "+val;
        };
        System.out.println(f1.apply(13));

        Predicate<String> p1 = (str)-> {
            if(str.equals("Anurag")) return true;
            return false;
        };
        boolean res = p1.test("Anurag");
        System.out.println("Did you give correct name : "+res);

        Supplier<Integer> s1 = ()->{
            return 25;
        };
        System.out.println("value from supplier is : "+s1.get());
    }
}
