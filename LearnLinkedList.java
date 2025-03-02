import java.util.LinkedList;

public class LearnLinkedList {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("India");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");

        System.out.println("Cities List : " + cities);

        cities.addFirst("Sydney");
        System.out.println("Cities List after adding first : " + cities);

        cities.addLast("Berlin");
        System.out.println("Cities List after adding last : " + cities);

        cities.remove("London");
        System.out.println("Cities List after removal : " + cities);

        if (cities.contains("Tokyo")) {
            System.out.println("Tokyo is in the list");
        }
        System.out.println("Size of the list : " + cities.size());
    }
}
