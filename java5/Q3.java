import java.util.Arrays;
import java.util.List;

public class Q3 {
    static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,8,10,12,13,14,15);
        int sum =0;
        sum = list.stream().filter(e->e>5).reduce(0,Q3::sum);
        System.out.println("sum of numbers greater than 5 in list is "+sum);
    }
}
