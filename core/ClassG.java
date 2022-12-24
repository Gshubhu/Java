package core;

import java.util.Arrays;

public class ClassG 
{
	int[] meth1(int arr1[], int []arr2)
	{
		System.out.println("meth1() called");
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr2:"+Arrays.toString(arr2));
		return new int[] {arr1[arr1.length-2],arr2[arr2.length-2]};
	}
	int meth2(int a, int b)
	{
		System.out.println("meth2() called");
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		return a;
	}
	public static void main(String[] args)
	{
		ClassG obj=new ClassG();
		int x=20;
		System.out.println(obj.meth2(10, x));
		
		System.out.println("---------------------");
		
		int input1[]= {10,20,30};
		
		int result[]=obj.meth1(input1,new int[] {100,200,300});
		System.out.println("meth1 is returning:"+Arrays.toString(result));
	}
}
