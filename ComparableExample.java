//Comparable interface, Comparator interface And Lambdas in java

import java.util.*;

class Student implements Comparable<Student>
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(Student o)
	{
		return this.id-o.id;
	}
	
	public String toString()
	{
		return "Student { ID ="+this.id+",Name ="+this.name+"}";
	}
}

public class ComparableExample
{
	public static void main(String args[])
	{
		List<Student> lst=new ArrayList<>();
		lst.add(new Student(7,"MS Dhoni"));
		lst.add(new Student(18,"Virat Kohli"));
		lst.add(new Student(1,"KL Rahul"));
		lst.add(new Student(45,"Rohit Sharma"));
		lst.add(new Student(8,"Ravindra Jadeja"));
		
		System.out.println("Before Sorting :"+lst);
		
		Collections.sort(lst);		//This sort method uses compareTo function automatically.
		
		System.out.println("After Sorting :"+lst);
		
		//Sort using lambdas.
		//Collections.sort(lst,(s1,s2)->s1.name.compareTo(s2.name));
		
		//Sort using comparator interface
		Collections.sort(lst,new Comparator<Student>()
		{
			public int compare(Student s1,Student s2)
			{
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println("After sorting by name :"+lst);
	}
}