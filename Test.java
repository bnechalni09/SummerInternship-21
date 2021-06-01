//This example is all about static keywords.
//static methods and static variables.

class Test
{
	int x=3;
	static int y=10;
	/*
	static int getX()
	{
		return x;			//This will produce error because x is not a static variable.
	}
	*/
	
	static void setY(int val)
	{
		y=val;
	}
	
	static int getY()
	{
		return y;
	}
	
	public static void main(String args[])
	{
		Test objA=new Test();
		Test objB=new Test();
		objA.setY(10);
		objB.setY(110);
		System.out.println(getY());
	}
}