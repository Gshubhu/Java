package core;

public class fourty_three 
{
	int c;
	static int e;
	fourty_three()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args)
	{
		int a=34;
		int b=21;
		new fourty_three().c =a++ + ++b;
		int d=--a+ --b+new fourty_three().c--;
		e=a+ +b + +new fourty_three().c+d--;
		int f=-a+b-- + -new fourty_three().c- d++;
		int sum=a+b+new fourty_three().c+d+e+f;
		System.out.println("Sum:"+sum);
	}
	
}
