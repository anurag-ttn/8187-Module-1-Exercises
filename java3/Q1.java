import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<Float> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter "+(i+1)+"th number in list");
            lst.add(sc.nextFloat());
        }

        float total = 0.0F;
        Iterator<Float> ie = lst.iterator();
        while(ie.hasNext()){
            total+=ie.next();
        }
        System.out.println("Sum of the list is "+total);
    }
}
