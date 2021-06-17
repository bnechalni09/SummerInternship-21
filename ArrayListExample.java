//This is the example of ArrayList Collection.
import java.util.*;

class ArrayListExample
{
	public static void main(String args[])
	{
		int n=5;
		ArrayList<Integer> lst=new ArrayList<Integer>(n);
		
		//Add items to collection.
		for(int i=0;i<n;i++)
		{
			lst.add(i);
		}
		System.out.println(lst);
		
		//Remove items from collection.
		lst.remove(3);
		System.out.println(lst);
		
		//Get element by index
		System.out.println("3rd element is :"+lst.get(2));
		
		//adding element to the particular index
		lst.add(2,100);	//Add 100 at 2nd index.
		System.out.println(lst);
		
		//Change element 
		lst.set(1,500);	//Overwrite the element at 1st index.
		System.out.println(lst);
		
		//Add another collection to existing array list.
		List<Integer> newlist=new ArrayList<Integer>();
		newlist.add(1001);
		newlist.add(1002);
		newlist.add(1003);
		newlist.add(1004);
		newlist.add(1005);
		newlist.add(1006);
		lst.addAll(newlist);
		System.out.println(lst);
		
		
		//Iterate through the list using Iterator
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext())
		{
			System.out.println("iterator "+it.next());
		}
	}
}