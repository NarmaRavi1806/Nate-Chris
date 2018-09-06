package exceptions;

public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			emp e=new emp();
			e.getDetails();
			
			}catch (AgeException e) {
			System.out.println( e);
			System.out.println("Age should be above 18");
			}

	}

}
