package inheritance;



public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(20,"Smith");
		Person p2=new Person(25,"Kathy");
		
		
		System.out.println(p1);
		
		
		Account acc=new Account();
		System.out.println(acc.toString());
		acc.getAccno();
		acc.setPerson(p1);
		acc.setBal(2000);
		acc.deposit(2000);
		
		
		System.out.println(p2);
		
		Account acc1=new Account();
		System.out.println(acc1.toString());
		acc1.setPerson(p2);
		acc1.setBal(3000);
		acc1.withdraw(2000);
		acc1.getbalance();
		
		
		
		
		
		
		
	}

}
