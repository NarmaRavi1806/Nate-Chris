package lambdastream;


import java.util.function.Consumer;
import java.util.function.Supplier;



public class Lab11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails emp=new EmpDetails();
		Supplier<EmpDetails> s1 = EmpDetails::new;
		s1.get().setName("Balu");
		s1.get().setGender("Male");
		s1.get().setAge(23);
		s1.get().setDesig("Analyst");
		s1.get().setSal(30000.0);
		
		System.out.println(s1);
		
		
		System.out.println(emp.getName());
		System.out.println(s1.get().getGender());
		System.out.println(s1.get().getAge());
		System.out.println(s1.get().getDesig());
		System.out.println(s1.get().getSal());
	}

}
