package core;

public class HashCode 
{
	void meth1()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		HashCode obj1=new HashCode();
		HashCode obj2=new HashCode();
		
		int x=obj1.hashCode();
		int y=obj2.hashCode(); //the return type of hashCode() is integer
		
		System.out.println("obj1 hashCode:"+x);
		System.out.println("obj2 hashCode:"+y);
		
		
	}
}
