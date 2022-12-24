package core;

public class twenty_one 
{
	int i;
	short s;
	byte b;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("int default value:"+i);
		System.out.println("short default value:"+s);
		System.out.println("byte default value:"+b);
		System.out.println("long default value:"+l);
		System.out.println("float default value:"+f);
		System.out.println("double default value:"+d);
		System.out.println("char default value:"+c);
		System.out.println("boolean default value:"+flag);
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int i1=10;
		int i2=20;
		int i3=i1+i2;
		System.out.println("i3 value is:"+i3);
		
		byte b1=10;
		byte b2=10;
		byte b3=(byte)(b1+b2);
		System.out.println("b3 value:"+b3);
		
		float f=10.9f;
		long x=2147483648L;
	}
	public static void main(String[] args)
	{
		twenty_one obj=new twenty_one();
		obj.meth1();
		System.out.println("-----------------------------------------------");
		obj.meth2();
	}
	
}
