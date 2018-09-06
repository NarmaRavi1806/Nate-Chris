package testing;

public class PersonClass {
	
	String firstname;
	String lastname;
	char gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public PersonClass(String firstname, String lastname, char gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	
	public String DisplayDetails(){
		System.out.println("Person Details");
		
		return "Firstname= "+firstname+" Lastname= "+lastname+" Gender="+gender;
	}
	@Override
	public String toString() {
		return "PersonClass [firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + "]";
	}

}
