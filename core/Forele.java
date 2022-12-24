package core;

public class Forele 
{
	char meth1(int a , char c)
	{
		System.out.println(a);
		System.out.println("c");
		System.out.println(c);
		return 'A';
	}
	public static void main(String[] args)
	{
		System.out.println(new Forele().meth1(50, 'x'));
	}
}
