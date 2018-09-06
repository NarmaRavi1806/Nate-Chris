package collections;

public class Employee1 {
	
	String name;
	int id;
	String email;
	String phone;
	
	String companyname;
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", email=" + email
				+ ", phone=" + phone + ", companyname=" + companyname + "]";
	}
	public Employee1(String name, int id, String email, String phone,
			String companyname) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.companyname = companyname;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
	@Override
	public boolean equals(Object obj){
		boolean flag=false;
		Employee1 e=(Employee1) obj;
		Employee1 current=this;
		
		if(e.email.equals(current.email) && 
				e.companyname.equals(current.companyname)){
			flag=true;
		}
		return flag;
	}

}
