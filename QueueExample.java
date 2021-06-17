//Example of queue using linked list.
import java.util.*;

class QueueExample
{
	public static void main(String args[])
	{
		Queue<Integer> queue=new LinkedList<>();
		
		//For add elements in queue.
		queue.offer(70);
		queue.offer(23);
		queue.offer(53);
		queue.offer(21);
		
		System.out.println("Queue :"+queue);
		
		//Pop the element from the queue.
		System.out.println(queue.poll());
		
		System.out.println("Queue :"+queue);
		
		//Peek
		System.out.println("Peek element is :"+queue.peek());
	}
}