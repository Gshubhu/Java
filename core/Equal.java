package core;

public class Equal 
{
	void meth1()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		Equal obj1=new Equal();
		Equal obj2=new Equal();
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj1));
		System.out.println(obj2.equals(obj1));
		System.out.println(new Equal().equals(new Equal()));
		System.out.println(obj1.equals(new Equal()));
	}
}
