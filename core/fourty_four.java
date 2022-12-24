package core;

public class fourty_four 
{
	void implicit()
	{
		System.out.println("programming implicit + type casting");
		byte b=50;
		int i1=b;
		System.out.println("byte value:"+b);
		System.out.println("int value:"+i1);
		char c='A';
		int i2=c;
		System.out.println("char value:"+c);
		System.out.println("int value:"+i2);
		//int & char datatype both are compitable datatypes
		System.out.println("==>"+new fourty_four().meth1()+('A'- 60));
		//Concation will be done if a string is present
		System.out.println("---------------------------------------");
		System.out.println(meth1()+('A'- 60));
		System.out.println("---------------------------------------");
		new fourty_four().meth2('a');
	}
	int meth1()
	{
		System.out.println("meth1() called");
		return 'A';
	}
	void meth2(int x)
	{
		System.out.println("meth2() called");
		System.out.println(x+3);
	}
	public static void main(String[] args)
	{
		fourty_four obj=new fourty_four();
		obj.implicit();
	}
}
