package core;

public class thirty_first 
{
	void meth1(int a)
	{
		if(a!=100)
		{
				System.out.println("If block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
	}
	void meth2(int age)
	{
		if(age>=60 || age<=100);
		{
			System.out.println("egilisible for person");
		}
		
		{
			System.out.println("Not egolisible for person");
		}
		
	}
	public static void main(String[] args)
	{
		thirty_first obj = new thirty_first();
		obj.meth1(90);
		System.out.println("------------------------------------------");
		obj.meth2(75);
	}
}
