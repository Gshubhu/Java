package core;

public class Sixten 
{
	int meth(int a)//a=1
	{
		System.out.println("Hi");
		return new Sixten().meth2()+a;//99+1=100
	}
	int meth2()
	{
		System.out.println("Hello");
		return 99;
	}
	public static void main(String[] args)
	{
		System.out.println(new Sixten().meth(1));
	}
}
