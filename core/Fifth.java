package core;

public class Fifth 
{
	void meth1()
	{
		int a=10;
		int b=20;
		System.out.println("Addition:"+(a+b));
	}
	void meth2() 
	{
		int a=55;
		int b=75;
		System.out.println("Substration:"+(b-a));
	}
	void meth3() 
	{
		int a=30;
		System.out.println("Multipication:"+(a*a));
	}
	void meth4() 
	{
		int a=60;
		int b=5;
		System.out.println("Divison:"+(a/b));
	}
	public static void main(String[] agrs)
	{
		System.out.println("Mathematical expression are follow:");
		System.out.println("Start");
		Fifth obj=new Fifth();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		System.out.println("End");
	}
}
