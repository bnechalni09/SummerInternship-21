class SuperClass
{
	int a=10;
	static int s=20;
	
	void print()
	{
		System.out.println("Hello I am superclass!");
	}
}

class SubClass extends SuperClass
{
	int a=12;
	static int s=50;
	
	void print()
	{
		System.out.println("Hello I am subclass!");
	}
	
	public static void main(String args[])
	{
		SuperClass s=new SubClass();
		s.print();
		System.out.println("Superclass variable a"+s.a);
		System.out.println("Superclass variable s"+s.s);
		
		SubClass st=new SubClass();
		System.out.println("Subclass variable a"+st.a);
		System.out.println("Subclass variable s"+st.s);
	}
}