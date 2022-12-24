package core;

public class fiftele
{
	int meth1(int a , int b , char c)
	{
		System.out.println(c);
		int result= new fiftele().meth2("java",100,'y');
		return 10+a+result;
	}
	int meth2(String S , int a , char c)
	{
		System.out.println(S);
		System.out.println(c);
		return 20;
	}
	public static void main(String[] args)
	{
		System.out.println(new fiftele().meth1(10,20,'X'));
	}
}
