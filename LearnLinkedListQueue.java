import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);

        System.out.println(q1);

        System.out.println(q1.poll());

        System.out.println(q1);

        System.out.println(q1.peek());
    }
}
