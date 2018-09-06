package inheritance;

public class Savingacc extends Accountques2 {
	
	final int minbal=500;

	@SuppressWarnings("unused")
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		if(minbal<500)
		{
			System.out.println("Withdrawal is not applicable");
		}
		else
		{
			System.out.println("Withdraw");
		}

	}
	

}
