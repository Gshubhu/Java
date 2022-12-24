package core;

public class Seven 
{
	void meth1(int a , int b)
	{
		new Seven().meth4(10,2,2);
		System.out.println(a-1);
		System.out.println(b);
	}
	void meth2( int x)
	{
		System.out.println(x);
		new Seven().meth1(10, 10);
		System.out.println(x+9);
	}
	void meth3( int x , int y)
	{
		System.out.println(x);
		new Seven().meth2(1);
		System.out.println(y);
	}
	void meth4(int a , int b , int c)
	{
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		new Seven().meth3(5,2);
	}
}
