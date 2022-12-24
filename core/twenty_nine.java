package core;

public class twenty_nine 
{
	twenty_nine(int age)
	{
		if(age>=18)
		{
			System.out.println("Person is eglisible");
		}
		else
		{
			System.out.println("Person is not eglisible");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Person age");
		new twenty_nine(39);
	}
}
