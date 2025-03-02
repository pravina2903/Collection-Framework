import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

  public static void main(String args[]){

    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

    pq.offer(10);
    pq.offer(20);
    pq.offer(5);
    pq.offer(15);

    System.out.println(pq);

    pq.poll();
    System.out.println(pq);

    System.out.println(pq.peek());
  }
}


