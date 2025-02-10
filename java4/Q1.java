

public class Q1 {
    public static void main(String[] args) {
        GreaterNum obj = (a,b)->{
            return a > b;
        };
        System.out.println("is 4 greater than 6 : "+obj.Greater(4,6));
        System.out.println("is 8 greater than 6 : "+obj.Greater(8,6));

        IncNum obj1 = (a)->{
            return (a+1);
        };
        System.out.println("before increment : 10 & after increment :"+obj1.Increment(10));

        ConcString obj3 = (a,b)->{
            return a+b;
        };
        System.out.println(obj3.concatenate("hi","there!"));

        ToUpper obj4 = (a)->{
            return a.toUpperCase();
        };
        System.out.println(obj4.UpperCase("hello world"));
    }
}
