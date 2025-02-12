import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add(null);
        list.add(null);
        list.add("three");
        for(int i=0;i<5;i++){
            Optional<String> st = Optional.ofNullable(list.get(i));
            System.out.println(st.isPresent());
            st.ifPresent((val)-> System.out.println("the value present is "+val));
            System.out.println(st.orElse("default"));;
//            System.out.println(Optional.empty());
            System.out.println(st.orElseGet(()-> "default output from supplier"));
            st.ifPresentOrElse((val)-> System.out.println(val+val),()-> System.out.println("no val!"));

        }
    }
}
