package core;

public class thirty_two 
{
	int a;
	static int b;
	thirty_two()
	{
		a++;
		b++;
		System.out.println("Instance variable:"+a);
		System.out.println("Static variable:"+b);
	}
	public static void main(String[] args)
	{
		new thirty_two();
		System.out.println("--------------------------");
		new thirty_two();
		System.out.println("--------------------------");
		new thirty_two();
	}
}
