package core;

public class thirty_five 
{
	static int x= thirty_five.meth1();
	
	static int meth1()
	{
		System.out.println("Static meth1() called");
		return 100;
	}
	static
	{
		System.out.println("static bolck executed");
	}
	public static void main(String[] args)
	{
		System.out.println("main() called");
	}
}
