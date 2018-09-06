package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("1","Narma"));
		ts.add(new Student("2","Aakansha"));
		ts.add(new Student("3","Shruthi"));
		
		System.out.println(ts);
		
		TreeSet<Person> p=new TreeSet<>(new  Person("",""));
		p.add(new Person("1","Narma"));
		p.add(new Person("2","Aakansha"));
		p.add(new Person("3","Shruthi"));
		
		System.out.println(p);
		
		

	}

}
