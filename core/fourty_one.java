package core;

public class fourty_one 
{
	static int x=m1();
	public static void main(String[] args)
	{
		System.out.println(fourty_one.x);
	}
	static
	{
		System.out.println(x);
		fourty_one.x=x+20;
	}
	static int m1()
	{
		fourty_one.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(fourty_one.x);
		return 100;
	}
}
