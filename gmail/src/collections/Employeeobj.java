package collections;

public class Employeeobj {
	
	public Employeeobj(){
		
	}
	private String name,emailid,phone;
	private int id;
	public Employeeobj(String name, String emailid, String phone, int id) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int compareTo(Employeeobj o){
		int flag=-1;
		int id1=this.id;
		int id2=this.id;
		return id;
	}

}
