package core;

public class Dec2_02 
{
	int meth3(int []arr)
	{
		if(arr.length>=2)
			return arr[0]+arr[1];
		else if(arr.length==1)
			return arr[0];
		else
			return 0;
	}
	public static void main(String[] args)
	{
		int input[]= {10,85,96,100};
		int result= new Dec2_02().meth3(input);
		System.out.println(result);
	}
}
