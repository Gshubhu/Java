package core;

public class Four 
{
	void meth1()
	{
		System.out.println(10);
	}
	void meth2()
	{
		System.out.println(30);
	}
	void meth3()
	{
		System.out.println(40);
		Four obj=new Four();
		obj.meth1();
		System.out.println(50);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Four obj=new Four();
		obj.meth3();
		obj.meth2();
		System.out.println("Java is awesone");
		System.out.println("End");
	}
}
