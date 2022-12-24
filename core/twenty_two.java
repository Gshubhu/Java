package core;

public class twenty_two 
{
	int a=10; //instance variable
	static int b=20; //static variable
	
	int x; //instance variable
	static int y; //static variable
	boolean flag;
	
	/*
	 * final int k;//C.E.
	 * final static int i; //C.E.
	 * for final variable JVM will not provide any default value it is the responsibility of 
	 * the programmer to initialize the final variable 
	 */
	
	void meth1()
	{
		int c=30; //local variable
		System.out.println("Instance variable value:"+a); //Identifier Name
		System.out.println("Instance variable value:"+new twenty_two().a); //ClassObject
		System.out.println("------------------------------------------------------");
		
		System.out.println("Static variable value:"+b); //Identifier Name
		System.out.println("Static variable value:"+new twenty_two().b); // ClassObject
		System.out.println("Static variable value:"+twenty_two.b);  //ClassName
		System.out.println("-------------------------------------------------------");
	}
	void meth2()
	{
		int a=100;
		int b=200;
		
		System.out.println("Meth2() Called");
		System.out.println("Instance Value a:"+new twenty_two().a);
		System.out.println("Static value b:"+twenty_two.b);
		System.out.println("Local value a:"+a+"b:"+b);
		
	}
	/*
	 * System.out.println("c value:"+c); //C.E.
	 * Because the scope of the local variable is only up to the method
	 */
	
	void meth3()
	{
		System.out.println("meth3() called");
		int z;  //local variable
		System.out.println("Instance value x;"+x);
		System.out.println("Instance value flag:"+flag);
		System.out.println("Static value y:"+y);
	}
	public static void main(String[] args)
	{
		twenty_two obj=new twenty_two();
		obj.meth1();
		System.out.println("==========================================================");
		obj.meth2();
		System.out.println("==========================================================");
		obj.meth3();
	}
}
