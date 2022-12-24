package core;

public class thirty_three 
{
	int a;
	static int b;
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println("Instant variable value:"+a);
		System.out.println("Static variable value:"+b);
	}
	static void meth2()
	{
		System.out.println("meth2() called");
		System.out.println("Instant variable value:"+new thirty_three().a);
		System.out.println("Static variable value:"+b);
	}
	public static void main(String[] args)
	{
		thirty_three obj=new thirty_three();
		obj.meth1();
		//thirty_three.meth1();  //C.E. bcoz we can't call non-static method
		System.out.println("----------------------------------");
		obj.meth2();//by using object name
		System.out.println("----------------------------------");
		thirty_three.meth2();//by using class name
		System.out.println("----------------------------------");
		meth2();//by using identifier name
	}
}
