import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args){
       Stream<Integer> st = Stream.iterate(0,i->i<30,i->i+2);
       st.forEach(System.out::println);
    }
}
