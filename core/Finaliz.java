package core;

public class Finaliz 
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args)
	{
		
		Finaliz obj1=new Finaliz();
		Finaliz obj2=new Finaliz();
		obj1.meth1();
		obj2=null;
		System.gc();//calling garbed collector
	}
}
