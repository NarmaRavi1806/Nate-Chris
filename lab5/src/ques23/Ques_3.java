package ques23;

public class Ques_3 extends Abstractclass_2 {
	int bal=3000,amount;

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		//int bal,amount1;
		if (bal >= amount) {
        	System.out.println("Current Balance"+bal);
        	System.out.println("Withdrawed "+amount);
            bal = (int) (bal - amount);
            System.out.println("Current Balance" + bal);
        }
        else {
            System.out.println("Unable to withdraw " + amount + " due to insufficient funds.");
        }
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques_3 a= new Ques_3();
		a.withdraw(2000);

	}

}
