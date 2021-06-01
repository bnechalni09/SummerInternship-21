class StaticBlockDemo
{
	int x=10;		//Instance variable intializer
	static
	{
		int z=10;	//Local variable
		System.out.println("In Static Block");
	}
	
	//Instance Intialization block
	{
		System.out.println("In Instance Initialization block");
		System.out.println("Printing Instance variable Intializer");
	}
	
	//Constructor
	StaticBlockDemo(int y)
	{
		System.out.println("Within Constructor");
		System.out.println("Instance variable printed using constructor:"+x);
		x=y;
		System.out.println("Instance variable initialized using constructor:"+x);
	}
	
	StaticBlockDemo()
	{
		System.out.println("Within Constructor");
		System.out.println("Instance variable initialized using constructor:"+x);
	}
	
	public static void main(String args[])
	{
		System.out.println("In Main");
		StaticBlockDemo st=new StaticBlockDemo(100);
		System.out.println("===========================");
		
		StaticBlockDemo st1=new StaticBlockDemo();
	}
}