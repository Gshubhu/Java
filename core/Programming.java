package core;

public class Programming 
{
	Programming()
	{
		System.out.println("I love Programmimg Langauge");
	}
	Programming(String s)
	{
		System.out.println("I love "+ s);
	}
	public static void main(String[] args)
	{
		new Programming();
		new Programming("Java");
	}
}
