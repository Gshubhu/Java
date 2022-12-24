package core;

public class twenty_eight 
{
	void meth1(int a, int b, int c)
	{
		System.out.println("Addition:"+(a+b+c));
		new twenty_eight().meth2(100, 1);
	}
	void meth2(int a, int b)
	{
		System.out.println("Subtraction:"+(a-b));
	}
	twenty_eight()
	{
		System.out.println("Division:"+(10/2));
	}
	twenty_eight(int a)
	{
		System.out.println("Multipication:"+(a*10));
	}
	public static void main(String[] args)
	{
		new twenty_eight(10).meth1(1,2,3);
	}
}
