package core;

public class Add_amut 
{
	int initial=500;
	Add_amut()
	{
		System.out.println("Initial account Balance :"+ initial);
	}
	Add_amut(int Deposit)
	{
		System.out.println("Total Ammount :"+(initial+Deposit));
	}
	public static void main(String[] args)
	{
		new Add_amut();
		new Add_amut(100);
	}
}
