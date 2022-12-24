package core;

public class Student 
{
	Student()
	{
		System.out.println("Student Name is Unknown");
	}
	Student(String name)
	{
		System.out.println("Student Name is "+name);
	}
	public static void main(String[] args)
	{
		new Student();
		new Student("Raju");
	}
}
