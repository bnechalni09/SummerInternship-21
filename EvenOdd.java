//WAP to sort the array such that all the even numbers are at starting of the array and all the odd numbers are at ending of the array.
import java.util.*;
class MyComparator implements Comparator<Integer>
{
	//If class implements Comparator interface than it must be override compare function.
	public int compare(Integer a,Integer b)
	{
		return a%2-b%2;
	}
}

class EvenOdd
{
	public static void main(String args[])
	{
		Integer arr[]={24,3,12,63,59,14};
		Arrays.sort(arr,new MyComparator());
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}