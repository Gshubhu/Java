package core;

public class CompEre 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return ;
	}
	int meth2()
	{
		System.out.println("Meth1() called");
		return 'A';
		//System.out.println("Hello World");//C.E. because it's unreachable code
	}
	int meth3()
	{
		System.out.println("Meth3() called");
		int i=10;
		if(i<25)
		{
			System.out.println("If block excuted");
			return 100;
			//System.out.println("Hi"); C.E.
		}
		else
		{
			System.out.println("Else block is Excuted");
			return 200;
			//System.out.println("Hello");//C.E.
		}
	}
	public static void main(String[] args)
		{
			System.out.println("Start");
			CompEre obj=new CompEre();
			obj.meth1();
			System.out.println("-----------------------------");
			obj.meth2();
			System.out.println("Meth2() is returning:"+1);//66
			System.out.println("-----------------------------");
			int result=obj.meth3();
			System.out.println("Result value:"+result);
			System.out.println("End");
			
		}
	
}
