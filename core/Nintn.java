package core;

public class Nintn 
{
	public String testmethod1()
	{
		System.out.println(35);
		return new Nintn().testmethod3(new Nintn().testmethod2())+new Nintn().testmeth4("Here");
	}
	public int testmethod2()
	{
		System.out.println(25);
		return(25+5);
	}
	public String testmethod3(int a)
	{
		System.out.println(15);
		return " is ";
	}
	public String testmeth4(String S)
	{
		System.out.println(45);
		return "awesome";
	}
	public static void main(String[] args)
	{
		Nintn t=new Nintn();
		System.out.println("Java"+t.testmethod1());
	}
}
