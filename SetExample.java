//This example is about HashSet.
import java.util.*;

public class SetExample
{
	public static void main(String args[])
	{
		Set<Integer> set=new HashSet<>();
		
		/*
		Set<Integer> set=new LinkedHashSet<>();
		LinkedHashSet creates a linked list of items that are added into the set. 
		Order of the element is maintained in LinkedHashSet.
		*/
		
		
		/*
		Set<Integer> set=new TreeSet<>();
		TreeSet creates a binary tree of the elements that are added in to the set.
		All the operation takes O(logN) time in TreeSet.
		*/
		
		//Add the elements to the set.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		
		System.out.println(set);
		
		//To remove the element
		set.remove(40);
		
		//If value you want to remove is not present in the set and you are trying to remove that value, you won't get any run time error.
		set.remove(1);		
		System.out.println(set);
		
		//To check whether value is availble in set or not.
		System.out.println(set.contains(40));
		
		//To check whether set is empty or not.
		System.out.println(set.isEmpty());
		
		//For getting size
		System.out.println(set.size());
	}
}