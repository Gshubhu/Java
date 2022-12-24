package core;

public class thirty 
{
	void thirty(String name, int age)
	{
		System.out.println("cheaking the ExamApperance");
		if(age>=21 && age<=35)
		{
			System.out.println(name+"eligsible");
		}
		else
		{
			System.out.println(name+"not eligisible");
		}
	}
	public static void main(String[] args)
	{
		thirty obj=new thirty();
		obj.thirty("raheem",25);
	}
}
