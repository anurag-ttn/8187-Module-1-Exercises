import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(null,null,null);
        Stream<Optional<String>> st = Stream.iterate(0,i->i+1).limit(list.size())
                .map(e->{Optional<String> op = Optional.ofNullable(list.get(e));return op;});
        st.forEach(System.out::println);
    }
}
