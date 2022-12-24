package core;

public class thirty_four 
{
	final static int a;
	void meth1()
	{
		System.out.println("meth1() called");
		//a=50;// C.E.
	}
	static void meth2()
	{
		System.out.println("meth2() called");
		//a=50;//C.E.
	}
	static
	{
		System.out.println("1st static block executed");
		new thirty_four().meth1();
	}
	thirty_four()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		System.out.println("Main() executed:"+a);
	}
	static 
	{
		a=50;
		System.out.println("2nd Static block executed");
		meth2();
	}
}
