import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        SequencedCollection<Integer> list = new ArrayList<>();


        list.add(1);list.add(2);list.add(3);list.add(5);
        System.out.println(list);
        list.addFirst(10);
        System.out.println(list);
        list.addLast(21);
        System.out.println(list);
        System.out.println("removed first "+list.removeFirst());;
        System.out.println(list);
        System.out.println("removed last "+list.removeLast());
        System.out.println(list);
        System.out.println("first "+list.getFirst());
        System.out.println(list);
        System.out.println("last : "+list.getLast());
        System.out.println(list);
        System.out.println(list.reversed());


        System.out.println("-----------------------------------------------------------");
        SequencedSet<Integer> set = new LinkedHashSet<>();

        set.add(1);set.add(2);set.add(3);set.add(5);
        System.out.println(set);
        set.addFirst(10);
        System.out.println(set);
        set.addLast(21);
        System.out.println(set);
        System.out.println("removed first "+set.removeFirst());;
        System.out.println(set);
        System.out.println("removed last "+set.removeLast());
        System.out.println(set);
        System.out.println("first "+set.getFirst());
        System.out.println(set);
        System.out.println("last : "+set.getLast());
        System.out.println(set);
        System.out.println(set.reversed());

    }
}
