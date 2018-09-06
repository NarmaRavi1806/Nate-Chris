package exceptions;

public class Ques_1 {
	
	private String firstname;
	private String lastname;
	private char gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname)throws Exp {
		if(firstname.equals("")){
			throw new Exp("Firtname is empty");
		}
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname)throws Exp {
		if(lastname.equals("")){
		throw new Exp("Last name is empty");
		}
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
		// TODO Auto-generated method stub
		/*System.out.println("Personal details");
		System.out.println("----------------");
		System.out.println("Gender:"+args[0]);
		System.out.println("Age:"+args[1]);
		System.out.println("Weight:"+args[2]);
		try{
			System.out.println("FirstName:"+args[3]);
		}catch(Exception e){
			System.out.println("Firstname is blank");
		}
		try{
			System.out.println("LastName:"+args[4]);
		}catch(Exception e1){
			System.out.println("Lastname is blank");
		}
		//System.out.println("Gender:"+args[2]);
		//System.out.println("Age:"+args[3]);
		//System.out.println("Weight:"+args[4]);*/

	

}
