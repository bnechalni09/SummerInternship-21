//Example of Deque
import java.util.*;

class DequeExample
{
	public static void main(String args[])
	{
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.offer(27);
		adq.offerFirst(9);		//Add the element at start
		adq.offerLast(7);		//Add the element at last
		adq.offer(4);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());	//Peek First element
		System.out.println(adq.peekLast());
		//Peek Last element
		
		System.out.println(adq.poll());		//Remove element from the top
		System.out.println(adq);
		
		System.out.println(adq.pollFirst());
		//Remove element from the top
		System.out.println(adq);
		
		System.out.println(adq.pollLast());
		//Remove element from the last.
		System.out.println(adq);
	}
}