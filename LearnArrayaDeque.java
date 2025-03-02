import java.util.ArrayDeque;

public class LearnArrayaDeque {

	public static void main(String[] args) {

		ArrayDeque<Integer> adq=new ArrayDeque<>();
		
		adq.offer(20);
		adq.offerFirst(15);
		adq.offer(25);
		adq.offerLast(35);
						
		System.out.println(adq);
		
		adq.offer(40);
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq);
		
		System.out.println(adq.poll());
		System.out.println(adq);

		
		System.out.println(adq.pollFirst());
		System.out.println(adq);

		System.out.println(adq.pollLast());
		System.out.println(adq);

	}

}
