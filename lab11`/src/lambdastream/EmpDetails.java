package lambdastream;

public class EmpDetails {
	
	String name;
	String gender;
	int age;
	String Desig;
	double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDesig() {
		return Desig;
	}
	public void setDesig(String desig) {
		Desig = desig;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpDetails [name=" + name + ", gender=" + gender + ", age="
				+ age + ", Desig=" + Desig + ", sal=" + sal + "]";
	}
	

}
