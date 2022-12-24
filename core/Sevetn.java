package core;

public class Sevetn 
{
	String meth1(int a , int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value= new Sevetn().meth5();
		System.out.println(value);
		return "Java";
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b=5;
		System.out.println(b-a);
		return (5*5)-b;
	}
	void meth3()
	{
		System.out.println("Start");
		System.out.println(new Sevetn().meth4());
		System.out.println(40);
		
	}
	String meth4()
	{
		System.out.println("Today is Thursday");
		return new Sevetn().meth1(4, 8);
	}
	int meth5()
	{
		Sevetn obj=new Sevetn();
		System.out.println(99);
		return obj.meth2(5);
	}
	public static void main(String[] args)
	{
		Sevetn obj=new Sevetn();
		obj.meth3();
	}
}
