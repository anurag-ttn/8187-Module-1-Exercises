import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,2,6,4);
        Set<Integer> set = Set.of(1,2,3,4);
        Map<String , Integer> map = Map.of("1one",1,"2two",2,"3three",3);
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}
