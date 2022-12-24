package core;

public class twenty_four 
{
	int a=10;
	public String method1()
	{
		new twenty_four(100,200," Java ");
		System.out.println(40);
		return new twenty_four().method3(new twenty_four(50).method2())+new twenty_four().method4("hi");
	}
	twenty_four()
	{
		System.out.println("Hi");
	}
	public int method2()
	{
		System.out.println(50);
		return 10+15;
	}
	twenty_four(int a)
	{
		System.out.println("Java is awesome");
	}
	public String method3(int a)
	{
		System.out.println(18);
		return " is ";
	}
	twenty_four(int a, int b, String s)
	{
		System.out.println(a+b);
		System.out.println(s);
	}
	public String method4(String s)
	{
		System.out.println(88);
		return " good ";
	}
	public static void main(String[] args)
	{
		twenty_four obj1=new twenty_four();
		obj1.a=10;
		twenty_four obj2=new twenty_four(50);
		obj2.a=30;
		System.out.println("Java"+obj1.method1()+""+(obj1.a+obj2.a-30));
	}
}
