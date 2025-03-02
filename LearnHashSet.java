
import java.util.HashSet;

public class LearnHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // not allowed duplicate or repeated values
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
