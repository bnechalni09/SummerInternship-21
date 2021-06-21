//This example is about HashMap

import java.util.*;

public class HashmapExample
{
	public static void main(String args[])
	{
		Map<String,Integer> numbers=new HashMap<>();
		
		numbers.put("MS Dhoni",7);
		numbers.put("Virat Kohli",18);
		numbers.put("Ravindra Jadeja",8);
		numbers.put("Sachin",10);
		
		System.out.println(numbers); 
		
		//To remove Key
		numbers.remove("Sachin");
		System.out.println(numbers);
		
		//For printing HashMap
		for(Map.Entry<String,Integer> e:numbers.entrySet())
		{
			System.out.println(e);	//Print whole element
			System.out.println(e.getKey());	//Only key
			System.out.println(e.getValue());	//Only values
		}
		
		System.out.println("Only Keys");
		for(String key:numbers.keySet())
		{
			System.out.println(key);
		}
		
		System.out.println("Only Value");
		for(Integer value:numbers.values())
		{
			System.out.println(value);
		}
		
		
	}
}