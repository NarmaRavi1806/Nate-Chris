package collections;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1("natalie",1806,"nate@gmail.com","7863462334","Capg");
		Employee1 e2=new Employee1("Cris",1806,"cris@gmail.com","8674527437","Avengers");
		Employee1 e3=new Employee1("Mahesh",1806,"mahesh@gmail.com","2347295737","Capg");
		

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

	}

}
