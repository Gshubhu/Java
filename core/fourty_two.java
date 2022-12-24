package core;

public class fourty_two 
{
	static int a=0;
	int b=0;
	
	fourty_two()
	{
		a++;
		b++;
		System.out.println("static variable ="+a);
		System.out.println("Instant variable="+b);
		System.out.println("--------------------------");
	}
	void display()
	{
		System.out.println("Accessing static  varible");
		System.out.println(fourty_two.a);
		System.out.println(a);
		System.out.println(new fourty_two().a);
	}
	public static void main(String[] args)
	{
		new fourty_two();
		new fourty_two();
		new fourty_two();
		System.out.println("##############################");
		new fourty_two().display();
	}
}

