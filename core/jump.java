package core;

public class jump 
{
	void meth1(int b) //b=20
	{
		int a=10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						break;
					}
					System.out.print("b value:"+b);
					++b;
				}
			}
			System.out.println("a value:" +a);
			a++;
		}
	}
	public static void main(String[] args)
	{
		new jump().meth1(20);
	}
}
