class ConstructorChaining
{
	private int a,b;
	ConstructorChaining()
	{
		this(10,20);
	}
	
	ConstructorChaining(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor Called!");
	}
	
	public static void main(String args[])
	{
		ConstructorChaining obj=new ConstructorChaining();
	}
}