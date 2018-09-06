/**
 * 
 */
package langfundamentals;

/**
 * @author narmar
 *
 */

public class personclass {
	public personclass(String firstname, String lastname, long phoneno) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneno = phoneno;
	}

	private String firstname;
	private String lastname;
	private char gender;
	long phoneno;
	
	

	

	public personclass(String firstname, String lastname, char gender,
			long phoneno) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phoneno = phoneno;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public personclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public personclass(String firstname, String lastname, char gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}

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

}
