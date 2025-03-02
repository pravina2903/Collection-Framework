import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        // not allowed duplicate or repeated values and follows binary sorted order
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(50);

        System.out.println(set);

        set.remove(20);
        System.out.println(set);

        System.out.println(set.contains(50));

        System.out.println(set.isEmpty());

        System.out.println("The size of a set : " + set.size());

        set.clear();
        System.out.println(set);

    }

}
