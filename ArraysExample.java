//This example is about Arrays Class
import java.util.*;
class ArraysExample
{
	public static void Print(int arr[])
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,7,8,9,10};
		
		//Binary Search
		int index=Arrays.binarySearch(arr,4);
		System.out.println("Value 4 found at index "+index);

		index=Arrays.binarySearch(arr,11);
		System.out.println("Value 11 found at index"+index);
		
		int numbers[]={132,63,12,5,7,335,56,23};
		//For sorting the array
		Arrays.sort(numbers);
		
		Print(numbers);
		
		//To fill the whole array with the same value.
		Arrays.fill(numbers,70);
		
		System.out.println("After using fill function");
		
		Print(numbers);
	}
}