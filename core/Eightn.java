package core;

public class Eightn 
{
	int meth1(int a, int b)
	{
		System.out.println(a);
		System.out.println(a-b);
		return new Eightn().meth4(a-1,"Hi");
		
	}
	String meth2(int x)
	{
		System.out.println(x-new Eightn().meth1(200, 199));
		System.out.println(x);
		return "Java";
	}
	String meth3(int a, int b, String S)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return S;
	}
	int meth4(int a, String S)
	{
		System.out.println(a);
		System.out.println(S);
		return a+a;
	}
	String meth5(String S)
	{
		return S;
	}
	public static void main(String[] args) 
	{
	System.out.println(new Eightn().meth5(new Eightn().meth3(15,25,new Eightn().meth2(500))));
	}
}
