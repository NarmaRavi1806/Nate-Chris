package collections;

public class Student implements Comparable<Student>{
	
	String id,name;

	public Student(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Student second) {
		// TODO Auto-generated method stub
		
		String name=this.name;
		String name1=second.name;
		return name1.compareTo(name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
