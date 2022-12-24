package core;

public class ClassA 
{
	ClassA()
	{
		System.out.println("Non-Parameterized Constructor");
	}
	ClassA(int a)
	{
		new ClassA();
		System.out.println("Parameterized Constructor:"+a);
	}
	void meth1()
	{
		System.out.println("Java is awesome");
	}
	public static void main(String[] args)
	{
		ClassA obj=new ClassA(500);
		obj.meth1();
	}
}
