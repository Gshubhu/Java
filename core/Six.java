package core;

public class Six 
{
	void meth1(int a , int b)
	{
		System.out.println(a+b);
		System.out.println(b);
	}
	void meth2(int a , String s)
	{
		System.out.println(s);
		new Six().meth3(10);
		System.out.println(a*2);
	}
	void meth3(int c)
	{
		System.out.println(c/2);
		new Six().meth1(99, 1);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		new Six().meth2(10,"Hi");
	}
}
