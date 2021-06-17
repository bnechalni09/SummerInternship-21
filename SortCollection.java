//Non primitive types can be considers as a collection in java.
//All the wrapper classes are non primitive types.

import java.util.*;

class SortCollection
{
	public static void main(String args[])
	{
		Integer[] arr={2,6,11,0,25,1};
		//This will print in decending order.
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}