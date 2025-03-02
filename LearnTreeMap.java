import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);
        System.out.println(numbers.containsValue(5));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.remove("Three"));

        // if (!numbers.containsKey("two")) {
        // numbers.put("two", 23);
        // }

        // OR

        numbers.putIfAbsent("two", 23);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String keyString : numbers.keySet()) {
            System.out.println(keyString);
        }
        for (Integer valueInteger : numbers.values()) {
            System.out.println(valueInteger);
        }
    }
}