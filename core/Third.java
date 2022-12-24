package core;

public class Third 
{
	void meth1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(a+90);
		System.out.println("Addition:"+(a+40));
		System.out.println("a");
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int a=100;
		int b=9;
		System.out.println("Substraction:"+(a-b));
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Third obj=new Third();
		obj.meth1();
		obj.meth2();
		System.out.println("End");
	}
}
