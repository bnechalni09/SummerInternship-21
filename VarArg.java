//This example is for Variable arguments.
class VarArg
{
	static void add(int...arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
		}
		System.out.println("Sum is : "+sum);
	}
	
	public static void main(String args[])
	{
		add(2,3,6,7,8);
	}
}