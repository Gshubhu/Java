package core;

public class thiele 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");
	}
	int meth2(int a , int b , int c) 
	{
		System.out.println(a);
		System.out.println();
		return a-b;
	}
	String meth3(String S, int b , int d)
	{
		System.out.println(b+d);
		return S;
	}
	int meth4(String S, int b, int k)
	{
		System.out.println(k);
		thiele obj=new thiele();
		int result= obj.meth2(50,50,50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a, String L) 
	{
		System.out.println(a+a);
		thiele obj=new thiele();
		String S = obj.meth3("Hi",15,10);
		System.out.println(S);
		return L;
	}
	public static void main(String[] args)
	{
		thiele obj=new thiele();
		System.out.println("Start");
		int result= obj.meth4("Hi",20,10);
		System.out.println(result);
		obj.meth1();
	}
}
