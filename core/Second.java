package core;

public class Second 
{
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
		System.out.println(20);
		Second obj=new Second();
		obj.meth2();
	}
	void meth2()
	{
		System.out.println("meth2() called");
		System.out.println(30);
		System.out.println(40);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Second obj=new Second();
		obj.meth1();
		System.out.println("End");
	}
}
