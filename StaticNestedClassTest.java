class StaticNestedClassTest
{
	int y;	//instance variable
	static int z=100;	//Class variable
	
	StaticNestedClassTest()
	{
		System.out.println("Out class consctructor called!");
	}
	
	static class StaticNestedClass
	{
		int x;
		static int staticinner=200;
		
		StaticNestedClass()
		{
			System.out.println("Static Nested class constructor called!");
		}
		void nestedClassNonStaticMethod()
		{
			//System.out.println("Accessing outer class variable y :"+y);		--> can't access
			System.out.println("Accessing static variable of outer class within static inner class z :"+z);
			outerClassStaticMethod();
		}
		
		static void nestedClassStaticMethod()
		{
			System.out.println("Within static Method of inner class");
			outerClassStaticMethod();
		}
	}
	
	static void outerClassStaticMethod()
	{
		System.out.println("outer class static method");
	}
	
	void outerClassInstanceMethod()
	{
		System.out.println("Outer class Instance method");
	}
	
	public static void main(String args[])
	{
		StaticNestedClassTest.StaticNestedClass obj=new StaticNestedClassTest.StaticNestedClass();
		obj.nestedClassNonStaticMethod();
		obj.nestedClassStaticMethod();
		
		
	}
}