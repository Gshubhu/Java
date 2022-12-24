package core;

public class Twele 
{
	int meth1(int a , String S)
	{
		System.out.println(S);
		return a*a;
	}
	int meth2(int a)
	{
		System.out.println("Hi");
		return a+a;
	}
	public static void main(String[] args)
	{
		
		Twele obj=new Twele();
		System.out.println(obj.meth1(5,"Hello")+ obj.meth2(25)+25);
	}
}
