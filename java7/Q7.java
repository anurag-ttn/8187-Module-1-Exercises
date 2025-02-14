import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Q7 {
    public static void main(String[] args) {
        SequencedMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<20;i++){
            int x =(int) (Math.random()*40);
            System.out.println(x);
            map.putFirst(x,x*x);
        }
        System.out.println("first entry in map is : "+map.firstEntry());
        System.out.println("last entry in map is : "+map.lastEntry());
        System.out.println("polling first entry : "+map.pollFirstEntry());
        System.out.println("polling last entry : "+map.pollLastEntry());
        map.putFirst(20,20*20);
        System.out.println("after operation : "+map.firstEntry());
        map.putLast(21,21*21);
        System.out.println("after last put operation : ");
        System.out.println("reversed : "+map.reversed());

    }
}
