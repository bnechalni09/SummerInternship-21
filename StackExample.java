//This example is about stack class
import java.util.*;
class StackExample
{
	public static void main(String args[])
	{
		Stack<String> students=new Stack<String>();
		students.push("Mahi");
		students.push("Virat");
		students.push("Rohit");
		students.push("Jaddu");
		
		System.out.println("Stack :"+students);
		
		//Peek
		System.out.println("Peek element is :"+students.peek());
		
		//Pop
		students.pop();
		System.out.println("Stack :"+students);
		
		System.out.println("Peek element is :"+students.peek());
	}
}