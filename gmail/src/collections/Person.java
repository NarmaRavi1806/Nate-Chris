package collections;

import java.util.Comparator;

public class Person implements Comparator<Person>{

	String pid,pname;

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		String name1=o1.pname;
		String name2=o2.pname;
		int st= name1.compareTo(name2);
		return st;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}

	public Person(String pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	
	

}
