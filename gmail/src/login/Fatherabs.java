package login;

public abstract class Fatherabs {
	
	public int salary=12000;

	public void constructhouse()
	{
		System.out.println("Constructed house");
	}
	public void buyaudi()
	{
		System.out.println("bought Audi");
	}
	public abstract void buyferrari();
	
	public static void print()
	{
		System.out.println("static Printed by father");
	}
}
