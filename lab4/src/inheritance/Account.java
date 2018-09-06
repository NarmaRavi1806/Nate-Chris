package inheritance;

public class Account {
	
	private long accno;
	private double bal;
	private Person person;
	@Override
	public String toString() {
		return "Account [accno=" + this.getAccno() + ", bal=" + bal + ", person="
				+ person + "]";
	}
	public long getAccno() {
		accno=(long) ((long)123456789*Math.random());
		return accno;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public void deposit(double amount)
	{
		System.out.println("Current Balance"+bal);
		System.out.println("Deposited "+amount);
		bal = bal+amount;
		System.out.println("Current balance "+bal);
	}
	
	 public void withdraw(double amount) {
	        if (bal >= amount) {
	        	System.out.println("Current Balance"+bal);
	        	System.out.println("Withdrawed "+amount);
	            bal = bal - amount;
	            System.out.println("Current Balance" + bal);
	        }
	        else {
	            System.out.println("Unable to withdraw " + amount + " due to insufficient funds.");
	        }
	    }
	 public void getbalance()
	 {
		 System.out.println("Current Balance" + bal);
	 }


}
