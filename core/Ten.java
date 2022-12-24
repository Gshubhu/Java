package core;

public class Ten 
{
	int meth1()
	{
		System.out.println("meth1() Called");
		return 100;
	}
	int meth2(int a , int b , String S)//a=5,b=2, String S=Java
	{
		System.out.println(S);
		return a*b;
	}
	public static void main(String[] args)
	{
		Ten obj=new Ten();
		System.out.println(obj.meth1()+obj.meth2(5,2,"Java")+90);
	}
}