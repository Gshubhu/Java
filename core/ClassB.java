package core;

public class ClassB 
{
	public ClassB()
	{
		System.out.println("Sunday");
		ClassB obj= new ClassB(10);
		System.out.println("Tuesday");
		String s=obj.display("Challage Accepted");
		System.out.println(s);
		
	}
	public ClassB(int temp)
	{
		System.out.println("Saturday");
		ClassB obj =new ClassB(10, 20);
		int a=obj.meth1()+temp;
		System.out.println("======>"+(a+obj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the next statement I am returing string value");
		return s;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassB(int data, int temp)
	{
		System.out.println("Thursday");
		System.out.println("======>"+(data+new ClassB("Hi").meth2()-temp));
	}
	ClassB(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		ClassB obj = new ClassB();
		System.out.println("Output Verified");
	}
}
