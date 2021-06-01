//This example is about Nested class type 1 - Non static inner class.

class InnerClassTest
{
	int y=20;		//instance variable of outer class
	static int a=30;	//class variable of outer class
	
	InnerClassTest()
	{
		System.out.println("Outer class Constructor Called!!");
	}
	
	class InnerClass
	{
		int x=10;
		final static int z=50;	//static constant.
		
		InnerClass()
		{
			System.out.println("Inner class Constructor Called!!");
		}
		void show()
		{
			System.out.println("Within Non-Static inner class");
			System.out.println("Can Access Inner class Variable x "+x);
			System.out.println("Can Access Outer class variable y "+y);
			System.out.println("Can Access Outer class static variables a"+a);
			System.out.println("Inner class instance accessed using this :"+this);
			System.out.println("Outer class referred from inner class using :"+InnerClassTest.this);
			
			outerInstanceMethod();
			outerClassMethod();
		}
	}
	
	void outerInstanceMethod()
	{
		System.out.println("Outerclass Instance method called from Inner class");
	}
	
	static void outerClassMethod()
	{
		System.out.println("Outerclass static method called from Inner class");
	}
	
	void createInnerObject()
	{
		System.out.println("Create Inner Object method called!");
		new InnerClass().show();
	}
	
	public static void main(String args[])
	{
		InnerClassTest object=new InnerClassTest();
		object.createInnerObject();
		
		InnerClassTest object1=new InnerClassTest();
		object1.createInnerObject();
		//Another way to create inner class object.
		//object.new InnerClass().show();
	}
}