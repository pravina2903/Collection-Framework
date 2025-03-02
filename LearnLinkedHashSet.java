
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        // not allowed duplicate//repeated values and follows linkedlist
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
