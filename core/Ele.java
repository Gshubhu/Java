package core;

public class Ele 
{
	public void meth1(int a , int b)
	{
		System.out.println("meth1() Called");
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		System.out.println(a+b);
	}
	int meth2(int a , int b , int c)
	{
		System.out.println("meth2() called");
		return 100-(a+b+c);
	}
	public static void main(String[] args)
	{
		System.out.println("Java");
		new Ele().meth1(49,50);
		System.out.println("------------");
		int x =new Ele().meth2(1,2,3);
		System.out.println("x value:"+x);
	}
}
