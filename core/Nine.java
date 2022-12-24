package core;

public class Nine 
{
	int meth1(int a , int b)//a=99, b=1
	{
		System.out.println(a);
		return a+b;
	}
	public static void main(String[] args)
	{
		System.out.println(new Nine().meth1(99,1));
	}
}
