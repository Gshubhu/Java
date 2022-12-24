package core;

public class ClassD 
{
	void meth1()
	{
		int a=10;
		System.out.println(++a);
		System.out.println(++a);
		a++;
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a++);
		--a;
		System.out.println(a--);
		System.out.println(++a);
		a=a++ + ++a;
		System.out.println("==>"+a);
	}
	public static void main(String[] args)
	{
		ClassD obj=new ClassD();
		obj.meth1();
	}
}
