import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("cat");
        animals.push("dog");
        animals.push("tiger");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals);
        System.out.println(animals.peek());

        System.out.println(animals.search("cat"));
        System.out.println(animals.empty());
    }
}
