package core;

public class Eight 
{
	public int meth1()
	{
		System.out.println("Hi");
		new Eight().meth2();
		return 100;
	}
	String meth2()
	{
		System.out.println("Hello");
		return "Java";
	}
	public static void main(String[] args)
	{
		new Eight().meth1();
		System.out.println("x");
	}
}