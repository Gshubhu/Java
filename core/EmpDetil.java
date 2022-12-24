package core;

import java.util.Scanner;
public class EmpDetil 
{
	void meth1()
	{
		Scanner sc= new Scanner(System.in);
		
				System.out.println("Enter EmpName");
				String EmpName=sc.nextLine();
				
				System.out.println("Enter EmpSal");
				int EmpSal=sc.nextInt();
				
				System.out.println("Enter EmpDept");
				String EmpDept=sc.next();
				
				System.out.println("Enter EmpAdd");
				sc.next();
				String EmpAdd=sc.nextLine();
				
				System.out.println("EmpName:" +EmpName);
				System.out.println("EmpSal:"  +EmpSal);
				System.out.println("EmpDept:" +EmpDept);
				System.out.println("EmpAdd:"  +EmpAdd);
		sc.close();
	}
	public static void main(String[] args)
	{
		EmpDetil obj=new EmpDetil();
		obj.meth1();
	}
}
