package inheritance;

public class Currentacc extends Accountques2 {
	
	long overdraftlimit= 20000;

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		boolean status=true;
		if(overdraftlimit==20000)
		{
			System.out.println(status);
			System.out.println("Overdraftlimit has reached and amount cannot be withdrawn");
		}
		else
		{
			System.out.println(status);
		}

	}

}
