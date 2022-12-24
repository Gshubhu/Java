package core;

public class Twenty_three 
{
	String empName;
	int empSal;
	String empDept;
	static String empCampy="  TCS";
	
	Twenty_three(String name,int sal, String Dept)
	{
		empName = name;
		empSal = sal;
		empDept = Dept;
	}
	public static void main(String[] args)
	{
		Twenty_three obj1= new Twenty_three("Kishan ",2000,"  Java");
		Twenty_three obj2= new Twenty_three("Naresh ",45000," Oracel");
		Twenty_three obj3= new Twenty_three("Sujata ",75000," Python");
		
		System.out.println(obj1.empName+""+obj1.empSal+""+obj1.empDept+""+obj1.empCampy);
		System.out.println(obj2.empName+""+obj2.empSal+""+obj2.empDept+""+obj2.empCampy);
		System.out.println(obj3.empName+""+obj3.empSal+""+obj3.empDept+""+obj3.empCampy);
	}
}
