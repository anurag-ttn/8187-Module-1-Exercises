import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,16);
        List<Integer> list2;
        list2 = list.stream()
                .filter(e->e>4)
                .map(e-> e*e)
                .collect(Collectors.toUnmodifiableList());

        try {
            list2.add(3);
        } catch (Exception e) {
            System.out.println("can not add elements! Unmodifiable list!");
        } finally {
            System.out.println(list2);
        }


    }
}
