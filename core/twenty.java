package core;

public class twenty 
{
	void meth1()
	{
		System.out.println("Java");
		System.out.println(" Is ");
		System.out.println("Awesone");
	}
	void meth2()
	{
		System.out.print("Java");
		System.out.print(" Is ");
		System.out.println("Awesone");
	}
	void meth3()
	{
		System.out.print("Java");
		System.out.print(" Is ");
		System.out.println("Awesone");
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		twenty obj=new twenty();
		obj.meth1();
		System.out.println("----------------------------------");
		obj.meth2();
		System.out.println("----------------------------------");
		obj.meth3();
	}
}
